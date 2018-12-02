package lab8;

import lab8.DepositorInformation.ContractType;

public class Main {
	public static void main(String[] args) {
		DepositorInformation depositor1 = new DepositorInformation("Кацюк Дмитрий Генадиевич", 123455, "Красные хуторы");
		depositor1.chooseContract(ContractType.CUSTOMARYCONTRACT);
		//	System.out.println(depositor1);
		//	System.out.println("_______________________________");
		//System.out.println();
		DepositorInformation depositor2 = new DepositorInformation("Барталев Павел Эдуардович", 123567, "дома");
		depositor2.chooseContract(ContractType.SHORTCONTRACT);
		//System.out.println(depositor2);
		
		ArrList listInfo = new ArrList();
		listInfo.addDepositor(depositor1);

		listInfo.addDepositor(depositor2);
		//listInfo.showDepositors();
		listInfo.searchDepositors("Барталев Павел Эдуардович");
		//listInfo.withdrawalOfInformationAboutDepositorsOnaGivenAmount(200);
		//listInfo.searchDeoisitorsOfDuration(3);
		//listInfo.removeDepositors("Барталев");
		//listInfo.showDepositors();

		listInfo.save("./depositors.ser");
		
		listInfo.clearList();
		
		listInfo.showDepositors();
		
		listInfo.load("./depositors.ser");
		
		listInfo.showDepositors();
		
	}
}
