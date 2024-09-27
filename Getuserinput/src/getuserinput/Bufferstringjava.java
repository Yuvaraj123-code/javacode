package getuserinput;

public class Bufferstringjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sc = new StringBuffer("yuvaraj"); 
		sc.append("goo maan");
		System.out.println(sc);
		
		StringBuffer sc1 = new StringBuffer("yuvaraj"); 
		sc1.replace(2, 3, "hello");
		System.out.println(sc1);
		
		
		StringBuffer sc2 = new StringBuffer("yuvaraj"); 
		sc2.delete(0, 3);
		System.out.println(sc2);
		
		StringBuffer sc3 = new StringBuffer("yuvaraj"); 
		sc3.reverse();
		System.out.println(sc3);
		
		
		
		
		
		
		
		
		
	}

}
