package main;
import java.util.Scanner;

import util.Participants;
import util.Person;

public class RandomPresenterApplication {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		startCallInteraction();
	}
		
	public static void startCallInteraction() {
		Participants list = new Participants();

		list.addParticipant(new Person("Manlio", "Manlio"));
		list.addParticipant(new Person("Mattia", "Manlio"));
		list.addParticipant(new Person("Chicco", "Manlio"));
		list.addParticipant(new Person("Elio", "Manlio"));
		list.addParticipant(new Person("Giuseppe", "Manlio"));

		String operation = null;
		boolean flag = true;

		do {
			print("Please select operation: add, remove, display, random, exit");
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
				print(p.toString());
				break;
			case "exit":
				flag = false;
				break;
			default:
				print("None of the above operations was selected. ");
			}
		} while (flag);

		print("Closed.");
	}
	
	public static String[] getNameSurnameInput() {
		print("Name:");
		String name = getInput();
		print("Surname:");
		String surname = getInput();
		return new String[]{name, surname};
	}
	
	public static String getInput() {
		return scan.nextLine();
	}
	
	public static void print(String message) {
		System.out.println(message);
	}

}
