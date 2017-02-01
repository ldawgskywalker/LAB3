public class MyInteger {
	private int value;
	//CONSTRUCTOR
	public MyInteger(int v){
		value = v;
	}
	//Set and get
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	//CHECKS IF NUMBER IS EVEN BY INPUT INT
	public static boolean isEven(int i){
		if(i%2==0)
			return true;
		else
			return false;
	}
	//CHECKS IF NUMBER IS ODD BY INPUT INT
	public static boolean isOdd(int i){
		if(i%2==0)
			return false;
		else
			return true;
	}
	//CHECKS IF NUMBER IS PRIME BY INPUT INT
	public static boolean isPrime(int n){
		for(int i=2; i<n; i++){
			if(n%i==0)
				return true;
		}
		
			return false;
			
	}
	//CHECKS IF NUMBER IS EVEN BY NUMBER SET AS VALUE
	public boolean isEven(){
		if(value%2==0)
			return true;
		else
			return false;
	}
	//CHECKS IF NUMBER IS ODD BY NUMBER SET AS VALUE
	public boolean isOdd(){
		if(value%2==0)
			return false;
		else
			return true;
	}
	//CHECKS IF NUMBER IS PRIME BY NUMBER SET AS VALUE
	public boolean isPrime(){
		for(int i=2; i<value; i++){
			if(value%i==0)
				return true;
		}
		
			return false;
	}
	//CHECKS IF NUMBER IS EVEN BY OBJECT
	public static boolean isEven(MyInteger letter){
		if(letter.getValue()%2==0)
			return true;
		else
			return false;
	}
	//CHECKS IF NUMBER IS ODD BY OBJECT
	public static boolean isOdd(MyInteger letter){
		if(letter.getValue()%2==0)
			return false;
		else
			return true;
	}
	//CHECKS IF NUMBER IS PRIME BY OBJECT
	public static boolean isPrime(MyInteger letter){
		for(int i=2; i<letter.getValue(); i++){
			if(letter.getValue()%i==0)
				return true;
		}
		
			return false;
	}
	
	//CHECKS IF NUMBER IS EQUAL BASED ON INPUT INT
	public boolean isEqual(int i){
		if(i==value){
			return true;
		}
		else
			return false;
	}
	
	//CHECKS IF NUMBER IS EQUAL BASED ON INPUT OBJECT
	public boolean isEqual(MyInteger i){
		if(i.getValue()==value){
			return true;
		}
		return false;
	}
	//CONVERT ARRAY OF CHAR TO INT
	public static int parseInt(char[] c){
		int num=0;
		for(int i=0;i<c.length;i++){
			num+=(int)c[i];
		}
		return num;
		
	}
	//CONVERT STRING TO INT
	public static int parseInt(String s){
		return Integer.parseInt(s);
	}
	
}

	
	
