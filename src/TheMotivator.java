public class TheMotivator {
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