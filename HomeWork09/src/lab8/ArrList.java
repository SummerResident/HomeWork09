package lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrList {

	private ArrayList<DepositorInformation> depositors = new ArrayList<DepositorInformation>();

	public void addDepositor(DepositorInformation depositor) {
		this.depositors.add(depositor);
	}

	public void searchDepositors(String fio) {
		for (DepositorInformation depositorInformation : depositors) {
			if (depositorInformation.toString().contains(fio)) {
				System.out.println(depositorInformation);
			}
		}
	}
		
	public void save(String fileName) {
		try {
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(depositors);
			outStream.flush();
			outStream.close();
			fileOut.flush();
			fileOut.close();
			System.out.println("Внесенные данные сохранены в файле: ");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void load(String fileName) {
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream inStream = new ObjectInputStream(fileIn);
			this.depositors = (ArrayList<DepositorInformation>) inStream.readObject();
			inStream.close();
			fileIn.close();
		} catch (IOException ex) {
			ex.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Класс с таким именем не найден.");
			c.printStackTrace();
			return;
		}
	}
	
	public void clearList() {
		this.depositors.clear();
	}
	
	public void withdrawalOfInformationAboutDepositorsOnaGivenAmount(int depositAmount) {

		for (DepositorInformation depositorInformation : depositors) {
			if (depositorInformation.getDepositAmount() > depositAmount) {
				System.out.println(depositorInformation);
			}
		}

	}

	public void removeDepositors(String fio) {
		for (int i = 0; i < depositors.size(); i++) {
			if (depositors.get(i).toString().contains(fio)) {
				depositors.remove(depositors.get(i));
			}
		}
	}

	public void searchDeoisitorsOfDuration(int duration) {
		for (DepositorInformation depositorInformation : depositors) {
			if (depositorInformation.getDureation() > duration) {
				System.out.println(depositorInformation);
			}
		}
	}

	public void showDepositors() {
		for (DepositorInformation depositorInformation : depositors) {
			System.out.println(depositorInformation);
			System.out.println("____________________________");
			System.out.println();
		}
	}

}
