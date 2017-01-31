public class Pizza {
	private int id;
	private int pizzaSold;
	private static double price;
	private static int totalPizza = 0;
	
	public Pizza(int id){
		this.id = id;
		pizzaSold = 0;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPizzaSold() {
		return pizzaSold;
	}
	public void justSold(int n){
		pizzaSold+=n;
		totalPizza+=n;		
	}
	public static void setPrice(double p){
		price = p;
	}
	public static double getPrice(){
		return price;
	}
	public static int soldPizza(){
		return totalPizza;
	}
	public static double Money(){
		
		return price*totalPizza;
	}
	
	
}
