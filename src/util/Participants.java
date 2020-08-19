package util;
import java.util.ArrayList;
import java.util.Random;

import main.RandomPresenterApplication;

public class Participants {

	private ArrayList<Person> _participants = null;
	private Random _rand = new Random();

	public Participants() {
		_participants = new ArrayList<>();
	}

	public void removeParticipant(Person participant) {
		_participants.remove(participant);
	}

	public void addParticipant(Person participant) {
		_participants.add(participant);
	}

	public Person getParticipant(int index) {
		return _participants.get(index);
	}

	public Person getPresenter() {
		int presenterIndex = _rand.nextInt(_participants.size());
		return getParticipant(presenterIndex);
	}

	public void dispayParticipants() {
		System.out.println("Actual partecipants:");
		for (Person p : _participants)
			RandomPresenterApplication.print(p.toString());
	}

}
