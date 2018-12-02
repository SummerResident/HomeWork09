package lab8;

public class DepositorInformation {

	private String fio;
	private int numberContract;
	private String homeAddress;
	private int depositAmount;
	private int duration;
	private ContractType contract;

	public DepositorInformation(String fio, int numberContract, String homeAddress) {

		this.setFio(fio);
		this.setNumberContract(numberContract);
		this.homeAddress = homeAddress;
	}

	enum ContractType {
		SHORTCONTRACT, CUSTOMARYCONTRACT, PREMIUMCONTRACT;
	}

	public ContractType getContract() {
		return contract;
	}

	public void chooseContract(ContractType contract) {
		this.contract = contract;

		if (getContract() == ContractType.SHORTCONTRACT) {
			setDepositAmount(300);
			duration = 3;
		} else if (getContract() == ContractType.CUSTOMARYCONTRACT) {
			setDepositAmount(600);
			duration = 6;
		} else if (getContract() == ContractType.PREMIUMCONTRACT) {
			setDepositAmount(1200);
			duration = 12;
		}
	}

	public String fio() {
		return fio;
	}

	private void setFio(String fio) {
		if (fio.matches("^[A-Za-z�-��-�].{0,64}$")) {
			this.fio = fio;
		} else {
			System.out.println("�� ����� ��� ������� ��������� ����� ��������.");
		}
	}

	public int numberContract() {
		return numberContract;
	}

	private void setNumberContract(int numberContract) {
		if (numberContract > 99999 && numberContract <= 999999) {
			this.numberContract = numberContract;
		} else {
			System.out.println("�� ����� ������������ ����� ���������.");
		}
	}

	public String toString() {
		return "�.�.�.: " + fio + "\n����� ���������: " + numberContract + "\n�������� �����: " + homeAddress
				+ "\n��� ���������: " + contract + "\n����� ������: " + getDepositAmount() + "\n�����������������: "
				+ duration;
	}

	public int getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}

	public int getDureation() {
		return duration;
	}

}
