package getuserinput;
import java.util.Scanner;
public class Swith {

public static void main(String []args) {
    	
    	int num = 5;
    	System.out.println("Enter a number 1-7");
    	Scanner sc = new Scanner(System.in);
    	 num = sc.nextInt();
   
    	switch(num) {
    	case 1 :
    		System.out.println("its a monday");
    	break;
    	case 2 :
    		System.out.println("its a tuesday");
    	break;
    	case 3 :
    		System.out.println("its a wednesday");
    	break;
    	case 4 :
    		System.out.println("its a thursday");
    	break;
    	case 5 :
    		System.out.println("its a friday");
    	break;
    	case 6 :
    		System.out.println("its a saturday");
    	break;
    	case 7 :
    		System.out.println("its a sunday");
    	break;
    	default :
    		System.out.println("not a day");
    	
    	}
}
}
