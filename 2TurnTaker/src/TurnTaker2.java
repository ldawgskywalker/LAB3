import java.util.Scanner;

public class TurnTaker2 {
	private static int turn = 0;
	private static int numTurn;
	private String name;

	public TurnTaker2(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public static int getTurn() {
		turn++;
		return turn;
	}

	public static void setTurn(int t) {
		numTurn = t;
	}
	public static int getNumTurn() {
		return numTurn;
	}
	public static boolean isMyTurn() {
		if (turn % 2 == 0) {
			return true;
		} 
		else {
			return false;
		}

	}

	public static void main(String[] args) {
		// declare Scanner
		Scanner kb = new Scanner(System.in);
		int numTurn;

		System.out.print("How many turns?");
		numTurn = kb.nextInt();
		TurnTaker2.setTurn(numTurn);

		TurnTaker2 person1 = new TurnTaker2("Romeo");
		TurnTaker2 person2 = new TurnTaker2("Juliet");
		for (int i = 1; i <= numTurn; i++) {
			System.out.println("Turn = " + TurnTaker2.getTurn());
			if (i == TurnTaker2.getNumTurn()) {
				System.out.println("Love from " + person1.getName());
				System.out.println("Love from " + person2.getName());
			} else if (TurnTaker2.isMyTurn())
				System.out.println("Love from " + person1.getName());
			else if (TurnTaker2.isMyTurn() == false)
				System.out.println("Love from " + person2.getName());
		}
		kb.close();
	}
}
