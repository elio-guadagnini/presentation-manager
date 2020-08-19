package util;

import java.util.Scanner;

import main.RandomPresenterApplication;

public class Call {

	private Scanner scan;

	public Call() {
		scan = new Scanner(System.in);
	}

	public void start() {
		Participants list = new Participants();

		list.addParticipant(new Person("Manlio", "Manlio"));
		list.addParticipant(new Person("Mattia", "Manlio"));
		list.addParticipant(new Person("Chicco", "Manlio"));
		list.addParticipant(new Person("Elio", "Manlio"));
		list.addParticipant(new Person("Giuseppe", "Manlio"));

		String operation = null;
		boolean flag = true;

		do {
			RandomPresenterApplication.print("Please select operation: add, remove, display, random, exit");
			operation = getInput();

			switch (operation) {
			case "add":
				String[] stringList = getNameSurnameInput();
				list.addParticipant(new Person(stringList[0], stringList[1]));
				break;
			case "remove":
				stringList = getNameSurnameInput();
				list.removeParticipant(new Person(stringList[0], stringList[1]));
				break;
			case "display":
				list.dispayParticipants();
				break;
			case "random":
				Person p = list.getPresenter();
				RandomPresenterApplication.print(p.toString());
				break;
			case "exit":
				flag = false;
				break;
			default:
				RandomPresenterApplication.print("None of the above operations was selected. ");
			}
		} while (flag);

		RandomPresenterApplication.print("Closed.");
	}

	public String[] getNameSurnameInput() {
		RandomPresenterApplication.print("Name:");
		String name = getInput();
		RandomPresenterApplication.print("Surname:");
		String surname = getInput();
		return new String[] { name, surname };
	}

	public String getInput() {
		return scan.nextLine();
	}

}
