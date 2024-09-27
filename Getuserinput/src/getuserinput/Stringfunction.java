package getuserinput;

public class Stringfunction {

	public static int add(int a,int b) {
		return a+b;
		
	}
	public static int sub(int a,int b) {
		return a-b;
		
	}
	public static int multiple(int a,int b) {
		return a*b;
	}
	
	public static int divide(int a,int b) {
		return a/b;
	}
	public static int square(int a) {
		return a*a;
	}
	
	public static int percentage(int a,int b) {
		return (a+b)/20*100;
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		int x=10;
		int y=10;
		
		int addition = add(x,y);
		System.out.println(addition);
		
		
		int substraction = sub(x,y);
		System.out.println(substraction);
		
		int multiplication = multiple(x,y);
		System.out.println(multiplication);

	int division  = divide(x,y);
	System.out.println(division);
	
	int squaree = square(x);
	System.out.println(squaree);
	
	int percentages = percentage(x,y);
	System.out.println(percentages);
	
	
		
	
	}
}
