package lab8;

import lab8.DepositorInformation.ContractType;

public class Main {
	public static void main(String[] args) {
		DepositorInformation depositor1 = new DepositorInformation("����� ������� ����������", 123455, "������� ������");
		depositor1.chooseContract(ContractType.CUSTOMARYCONTRACT);
		//	System.out.println(depositor1);
		//	System.out.println("_______________________________");
		//System.out.println();
		DepositorInformation depositor2 = new DepositorInformation("�������� ����� ����������", 123567, "����");
		depositor2.chooseContract(ContractType.SHORTCONTRACT);
		//System.out.println(depositor2);
		
		ArrList listInfo = new ArrList();
		listInfo.addDepositor(depositor1);

		listInfo.addDepositor(depositor2);
		//listInfo.showDepositors();
		listInfo.searchDepositors("�������� ����� ����������");
		//listInfo.withdrawalOfInformationAboutDepositorsOnaGivenAmount(200);
		//listInfo.searchDeoisitorsOfDuration(3);
		//listInfo.removeDepositors("��������");
		//listInfo.showDepositors();

		listInfo.save("./depositors.ser");
		
		listInfo.clearList();
		
		listInfo.showDepositors();
		
		listInfo.load("./depositors.ser");
		
		listInfo.showDepositors();
		
	}
}
