import java.util.Scanner;

public class PizzaDemo {
	public static void main(String[] args) {
		// declare scanner
		Scanner kb = new Scanner(System.in);
		// declare variables
		int id, numSold;
		Pizza.setPrice(5);
		System.out.print("Put the pizza IDs and the number of slices sold: ");
		// 5 PIZZA SHOP CREATION//
		
		// SHOP 1
		id = kb.nextInt();
		numSold = kb.nextInt();
		Pizza p = new Pizza(id);
		p.justSold(numSold);

		// SHOP 2
		id = kb.nextInt();
		numSold = kb.nextInt();
		Pizza p2 = new Pizza(id);
		p2.justSold(numSold);

		// SHOP 3
		id = kb.nextInt();
		numSold = kb.nextInt();
		Pizza p3 = new Pizza(id);
		p3.justSold(numSold);

		// SHOP 4
		id = kb.nextInt();
		numSold = kb.nextInt();
		Pizza p4 = new Pizza(id);
		p4.justSold(numSold);

		// SHOP 5
		id = kb.nextInt();
		numSold = kb.nextInt();
		Pizza p5 = new Pizza(id);
		p5.justSold(numSold);
		/////////////////////////
		
		System.out.println("Total pizzas sold: "+Pizza.soldPizza());
		System.out.println("Total sales: $"+Pizza.Money()+"0");
		
		
		// close scanner
		kb.close();
	}
}
