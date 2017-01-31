import java.util.Scanner;
public class PizzaDemo {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		int id, numSold;
		
		System.out.print("Put the pizza IDs and the number of slices sold: ");
		for(int i=0; i<5;i++){
			id = kb.nextInt();
			numSold  = kb.nextInt();
			if(i==0){
				Pizza p = new Pizza(id);
				p.justSold(numSold);
			}
			if(i==1){
				Pizza p2 = new Pizza(id);
				p2.justSold(numSold);
			}
			if(i==2){
				Pizza p3 = new Pizza(id);
				p3.justSold(numSold);
			}
			if(i==3){
				Pizza p4 = new Pizza(id);
				p4.justSold(numSold);
			}
		}
	kb.close();
	}
}
