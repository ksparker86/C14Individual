import java.util.ArrayList;

public class TheMotivator {
	private ArrayList<String> events = new ArrayList<String>() ;
	public void createEvents() {
		events.add("We're goin to see a movie on Saturday.") ;
		events.add("Study session on Sunday - Jim's house") ;
	}
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public void thoughtForTheDay() {
		System.out.println("I'm getting carpal tunnel from typing so much.") ;
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.thoughtForTheDay();
		tm.feedback(60);
	}
}