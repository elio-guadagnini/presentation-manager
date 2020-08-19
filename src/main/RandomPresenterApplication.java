package main;

import util.Call;

public class RandomPresenterApplication {

	public static void main(String[] args) {
		Call callMeeting = new Call();
		callMeeting.start();
	}

	public static void print(String message) {
		System.out.println(message);
	}

}
