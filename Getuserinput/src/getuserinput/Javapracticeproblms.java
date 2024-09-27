package getuserinput;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;

public class Javapracticeproblms {

//	public static void hello (int a) {
//		
//		for(int i=1;i<=)
//		
//	}
	public static void main(String[] args) {

		// sum of the odd number
		// Q1
//		   int count = 0;
//		   for(int i=1;i<=100;i++) {
//			   if(i%2==1) {
//				   count = count+i;
//			   }
//		   }
//		   System.out.println(count);

		// Q2 sum of the even number
//		   
//      int count =0;
//      for(int i=0;i<=100;i++) {
//    	  if(i%2==0) {
//    		  count = count +i;
//    	  }
//      }
//      System.out.println(count);
//	   
//	   

		/// Q3 count ofood num

//		   
//		   int count =0;
//		   
//		   for(int i=0;i<=100;i++) {
//			   if(i%2==1) {
//				   count = count+1;
//			   }
//		   }
//		   System.out.println(count);
//		   

		// Q4 count of even number

//		   int count =0;
//		   for(int i=1;i<=100;i++) {
//			   if(i%2==0) {
//				   count = count +1;
//			   }
//		   }
//		   System.out.println(count);
//		   

		// Q5 factoraial numbers

//		   int count=1;
//		   
//		   for(int i=1;i<=8;i++) {
//			   count = count *i;
//		   }
//		   System.out.println(count);
//		   

		// Q6 fibonacci series {0,1,1,2,3,5,8,13,21}
//		   int a =0;
//		   int b =1;
//		   System.out.println(a);
//		   System.out.println(b);		   
//		   for(int i =2;i<=10;i++) {
//			   int c= a + b;
//			   System.out.println(c);		   
//                  a=b;
//                  b=c;}

		// Q7 to find even or odd number
//		   Scanner e =new Scanner(System.in);
//		   System.out.println("Enter a Number");
//		   int n = e.nextInt();
//		   if(n%2==0) {
//			   System.out.println("Even number");
//		   }
//		   else {
//			   System.out.println("Odd number");
//
//		   }
//		   

		// Q8 swapping numbers
//		   int a,b,c;
//		   Scanner sc = new Scanner (System.in);
//		   System.out.println("enter the number");
//		   a = sc.nextInt();
//		   b = sc.nextInt();
//		   c=a;
//		   a=b;
//		   b=c;
//		   System.out.println("swappig numbers");
//		   System.out.println(a);
//		   System.out.println(b);

		// Q9 Swapping numbers without using third variable:

//         int a,b;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         
//         a = sc.nextInt();
//         b = sc.nextInt();
//         
//         a=a+b;
//         b=a-b;
//         a=a-b;
//
//         System.out.println(a);
//         System.out.println(b);

		// Q10 reverse the number

//		   Scanner sc = new Scanner(System.in);
//		   System.out.println("enter the number");
//		   int n = sc.nextInt();
//		   int a ;
//		   int i=0; int j =0;
//		    
//		   
//		    a=n;
//		   
//		   while (a>0) {
//			   i= a % 10;
//			   j=(j*10)+i;
//			   a=a/10;
//			   
//		   }
//		   System.out.println( "Reverse a number  " +j);

		// Q11 palindrome number

//		   int n;
//		   int a;
//		   int i=0; int j=0;
//		   Scanner sc = new Scanner(System.in);
//		      n = sc.nextInt();
//		      a=n;
//		      while(a>0) {
//		    	  i=a%10;
//		    	  j=j*10+i;
//		    	  a=a/10;
//		    	  
//		      }
//		      if(n==j) {
//		    	  System.out.println("palindrome");
//		      }else {
//		    	  System.out.println("non palindrome");
//
//		      }

		// Q12

//		   for (int n=1;n<=100;n++) {
//		   int a; 
//			   int i=0;
//			   int j=0;
//			   a=n;
//			   
//			   while(a>0) {
//				   i=a%10;
//				   j=(j*10)+i;
//				   a = a/10;
//			   }
//			   if(n==j) {
//				   System.out.println(n);
//			   }
//			   
//		   }

		// Q13

//	     int c  =0;
//	     
//	for(int n =1;n<=1000;n++) {
//		
//		int a; int i=0; int j =0;
//		  a=n;
//		while(a>0) {
//			i = a % 10;
//			j  = (j *10 )+ i;
//			a = a/10;
//			
//		}
//		if(n==j) {
//			c++;
//		}
//	}
//	System.out.println(c);

		// Q15

//		   for(int n =1;  n<=1000;n++) {
//			   int a,i=0,j=0;
//			   a=n;
//			   while(a>0) {
//				   i=a%10;
//				   j = j+ (i*i*i);
//				   a=a/10;
//			   }
//			   if(j==n) {
//				   System.out.println(n);
//			   }
//			   
//		   }

		// Q16

//            int c=0;
//		   
//		   for(int n=1;n<=1000;n++) {
//			   int a,i=0,j=0;
//			   a=n;
//			   
//			   while(a>0) {
//				   i=a%10;
//				   j=j +(i*i*i);
//				   a=a/10;
//			   }
//			   
//			   if(n==j) {
//				   c++;
//			   }
//		   }
//		   System.out.println(c);

		// Q17

//		for (int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println ( );
//		}

		// Q18

//		   for(int i=1;i<=5;i++) {
//			   for(int j=5;j>=i;j--) {
//				   System.out.print("*");
//				   
//			   }
//			   System.out.println();
//
//		   }

		// Q20

//		   int count;
//		   
//		   for(int i=1;i<=10;i++) {
//			   count=0;
//			   for(int j=2;j<=i/2;j++) {
//				   if(i%j==0) {
//				   count++;
//			   }
//			   
//			   }
//		   if(count ==0) {
//			   System.out.println(i);
//		   }
//		   
//	 }

		// Q21

//		 int count,c=0;
//		for(int i=1;i<=100;i++) {
//			count=0;
//			for(int j=2; j<=i/2;j++) {
//				if(i%j==0) {
//					count++;
//				}
//				
//			}
//			if(count==0) {
//				c++;
//			}
//			
//		}
//		System.out.println(c);

		// fabonoci
		// string reverse

//	int a =0;  int b =1;
//	
//	for(int i=1;i<=10;i++) {
//		int c = a+b;
//		System.out.println(c);
//		a=b;
//		b=c;
//	}
//		   

//		   int count ,c=0;
//		   
//		   for(int i=1;i<=100;i++) {
//			   count=0;
//			   for(int j=2;j<=i/2;j++) {
//				   if(i%j ==0) {
//					   count++;
//				   }
//			   }
//			   if(count==0) {
//				   c++;
//			   }
//		   }
//		   System.out.println(c);

		// Q22

//		   System.out.println("Enter your marks");
//		   Scanner sc = new Scanner(System.in);
//		   int n = sc.nextInt();
//		   
//		   if(100>=n && n>=90) {
//			   System.out.println("you got a+ grade");
//		   }
//		   else if(89>=n && n>=80) {
//			   System.out.println("you got a grade");
//		   }
//		   else if(79>=n && n>=70) {
//			   System.out.println("you got b grade");
//		   }
//		   else if(69>=n && n>=60) {
//			   System.out.println("you got c grade");
//		   }
//		   else if(59>=n && n>=30) {
//			   System.out.println("you has a failed");
//		   }

		// Q23
//		     System.out.println("enter a number");
//		   Scanner sc = new Scanner (System.in);
//		  int n = sc.nextInt();
//		  
//		  
//		 for(int i=1;i<=10;i++) {
//			 System.out.println( n +" * "+i+" = "+ n*i);
//		 }

		// System.out.printf( "\n %d * %d = %d",n,i,n*i);

//		   for(int i=0;i<=10;i++) {
//			   System.out.println("1*"+i+"= "+1*i);
//		   }

		// even or odd
//		 int a =0;
//		 for(int i=0;i<=100;i++) {
//			 if(i%2==1) {
//				a=a+i;
//			 }
//		 }
//		 System.out.println(a);
//		  

		// factorial
//		   
//		   Scanner sc = new Scanner(System.in);
//		   int n = sc.nextInt();
//		   int a=1;
//		   
//		   
//		   for(int i=1;i<=n;i++) {
//			   a=a*i;   
//			   
//		   }
//		   System.out.println(a);

//		

		// Q24

//		   Scanner sc = new Scanner(System.in);
//		   int a,b,c,d;
//		   
//		   System.out.println("Enter a four number");
//		   
//		   a=sc.nextInt();
//		   b=sc.nextInt();
//		   c=sc.nextInt();
//		   d=sc.nextInt();
//		   
//		   if( a >b && a>c && a>d) {
//			   System.out.println("largetst number is"+ a);
//		   }
//		   else if(b>a && b>c&& b>d) {
//			   System.out.println("largetst number is"+ b);
//
//		   }
//		   else if(c>a && c>b&& b>d) {
//			   System.out.println("largetst number is"+ c);
//
//		   }
//		   else {
//			   System.out.println("largest numbar "+d);
//		   }
//		   

//		   Scanner sc = new Scanner (System.in);
//		   
//		   int a,b,c;
//		   System.out.println("enter three number");
//		   
//		   a = sc.nextInt();
//		   b = sc.nextInt();
//		   c = sc.nextInt();
//		   
//		   if(a<b && a<c) {
//			   System.out.println("smallerst num"+a);
//		   }
//		   else if(b<a && b<c) {
//			   System.out.println("smallerst num"+b);
//
//		   }
//		   else {
//			   System.out.println("smallerst num"+c);
//
//			   
//		   }
//		   

		// multiplication
//		   
//		   
//		   System.out.println("Eneter a number");
//		   Scanner sc = new Scanner (System.in);
//		   int n = sc.nextInt();
//		   for(int i=1;i<=10;i++) {
//			   System.out.println(n +" * " +i+ " = "+n*i);
		// }

//		   String n = "Wellcome";
//		   
//		   int  vowels=0 ;
//		   int  nonvowels=0 ;
//		   
//		   for(int i=0;i<n.length();i++) {
//			   char ch = n.charAt(i);
//			   if(ch== 'a' || ch=='A'  || ch=='e'|| ch =='E'||ch=='i'|ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
//				   
//				   vowels++;
//			   }
//				   else {
//					   nonvowels++;
//				   }
//			   }
//		   System.out.println(vowels);
//		   System.out.println(nonvowels);

//		  //// nono 
//		   Scanner name = new Scanner (System.in);
//		  // String[] Words;
//		   String n = name.concat();
//		   
//		  //String [] n = a.nextInt();

		// decesending order

//		   int n,temp;
//		   Scanner sc = new Scanner(System.in);
//		   System.out.println("enter how many number you wanat yo store");
//		    n =  sc.nextInt();
//		    
//		   int a[] = new int [n];
//		   System.out.println("enter all the elemnts");
//		   
//		   for(int i=0;i<n;i++) {
//			   a[i] =sc.nextInt();
//		   }
//		   for(int i=0;i<n;i++) {
//			   for(int j =i+1;j<n;j++) {
//				   if(a[i]>a[j]) {
//					   temp=a[i];
//					   a[i]=a[j];
//					   a[j]=temp;
//				   }
//				   
//			   }
//		   }
//		   System.out.println("decending order");
//		   for(int i=n-1;i>0;i--) {
//			   System.out.print(a[i]+",");
//		   }
//
//		   System.out.print(a[0]);

		// asending order

//		   int n,temp;
//		   Scanner sc = new Scanner (System.in);
//		   System.out.println("enter how mny elements you want");
//		   
//		   n=sc.nextInt();
//		   
//		   int a[]= new int[n];
//		   System.out.println("enter the number");
//		   
//		   for(int i=0;i<n;i++) {
//			   a[i]=sc.nextInt();
//		   }
//			   for(int i=0;i<n;i++) {
//				   for(int j=1+i;j<n;j++) {
//					   if(a[i]>a[j]) {
//						   temp=a[i];
//						   a[i]=a[j];
//						   a[j]=temp;
//					   }
//					   
//					   
//				   
//			   }
//		   }
//		   System.out.print("asending oder");
//		   for(int i=0;i<n-1;i++) {
//			   System.out.print(a[i]+",");
//		   }
//		   System.out.print(a[n-1]);
//		   
//		   
//		   
//	       for(int i=1;i<=4;i++) {
//	    	   for(int j=4;j>=i;j--) {
//	    		   System.out.print("*");
//	    	   }
//	    	   System.out.println();
//	       }
//		   

//		   int n =6;
//		   
//		   for(int i=0;i<n;i++) {
//			   for(int j=0;j<n;j++) {
//				   if(i==0||j==0 || i==n-1 ||j==n-1) {
//					   System.out.print("*");
//				   }else {
//				   System.out.print(" ");
//			   }
//		   }
//		  
//			   System.out.print("\n");
//	   }

		// traingle

//		     int n=7;
//		     for(int i=0;i<n;i++) {
//		    	 for(int j=1;j<n-i;j++) {
//		    		 System.out.print(" ");
//		    	 }
//		    	 for(int j=0;j<i;j++) {
//		    		 System.out.print("* " );
//		    	 }
//		    	 System.out.println();
//		     }

//		   
		// tight angle triangle

//		   for(int i=0;i<=5;i++) {
//			   for(int j=0;j<=i;j++) {
//				   System.out.print("* ");
//			   }
//			   System.out.println(" ");
//		   }

		// number triangle

//		   int count =1;
//		   for(int i=0;i<5;i++) {
//			   for(int j=0;j<i;j++)
//				   if(i>=j) {
//					   System.out.print(count + " ");
//					   count++;
//				   }
//			   System.out.println();
//		   }

		// max number

//		   int a[] = {1,2,3,4,5,66,7};
//		   //int k;
//		   for(int i=0;i<a.length;i++) {
//			   for(int j=i+1;j<a.length;j++) {
//				   int tem=0;
//				  
//				   
//				   if(a[i]<a[j]) {
//					   tem =a[i];
//					   a[i] =a[j];
//					   a[j]=tem;
//					   
//				   }
//				   
//			   }
//			   
//		   }
//		 
//		   for (int k=0;k<a.length;k++) {
//			   System.out.println(a[k]);
//			   
//			   
//		   }
//		   System.out.println("third max number" + a[a.length-5]);
//		   
//		   
//		   int a[]={-12,45,-23,64,-100,24}; 
//		   
//		   for(int i =0;i<a.length;i++) {
//			   for(int j=i+1;j<a.length;j++) {
//				   int temp =0;
//				   
//				   if(a[i]<a[j]) {
//					   temp =a[i];
//					   a[i]=a[j];
//					   a[j]= temp;
//				   }
//			   }
//		   }
//		  for(int k=0;k<a.length;k++) {
//			  System.out.println(a[k]);
//		  }
//		  System.out.println("Third max num" + a[a.length-4]);

//		   int a[]={-12,45,-23,64,-100,24}; 
//		   
//		   for(int i=0;i<a.length;i++) {
//			   for(int j=i+1;j<a.length;j++) {
//				   int temp =0;
//
//				   if(a[i]<a[j]) {
//					   temp =a[i];
//					   a[i] =a[j];
//					   a[j] =temp;
//				   }
//			   }
//		   }
//		   for(int k=0;k<a.length;k++) {
//			   System.out.println(a[k]);
//		   }
//		   System.out.println("First max number" + a[a.length-6]);
//		   

		// cap,small number determine

//		   int a[]={-12,45,-23,64,-100,24}; 
//		   
//		   for(int i=0;i<a.length;i++) {
//			   for(int j=i+1;j<a.length;j++) {
//				   int temp =0;
//				   
//				   if(a[i]<a[j]) {
//					   temp =a[i];
//					   a[i]=a[j];
//					   a[j] = temp;
//					   
//				   }
//			   }
//		   }
//		   for(int k=0;k<a.length;k++) {
//			   System.out.println(a[k]);
//		   }
//		   System.out.println("Secound min number " + a[a.length-2]);

//		   String s = "Hi Welcome To Java Classes Tommorow At 2.00 p.m!!"; 
//		   
//		   int count=0;
//		   int count1 =0;
//		   int count2=0;
//		   int count3=0;
//		   
//		   for(int i=0;i<s.length(); i++) {
//			   
//			   if(s.charAt(i) >='a' && s.charAt(i) <='z'){
//			     count++;
//			   
//			   }
//			     else if(s.charAt(i) >='A' && s.charAt(i) <='Z') {
//			    	 count1++;
//			    	 
//			     }else if(s.charAt(i) >='0' && s.charAt(i)<='9') {
//			    	 count2++;
//			     }
//			     else {
//			    	 count3++;
//			     }
//			    	 
//			   
//		   }
//		   
//		   System.out.println("Small letter in a paraa - " + count);
//		   System.out.println("Cap letter in a para -"+ count1);
//		   System.out.println("number in apara -" + count2);
//		   System.out.println("Special character in a para -"+ count3);

		// count a number

//			  System.out.println("entter a random nnumber");
//		  Scanner sc = new Scanner (System.in);
//		  int n,i=0;
//		  n=sc.nextInt();
//		  
//		  while(n>0) {
//			  n=n/10;
//			  i++;
//		  }
//		   System.out.println(i);

		// reverse the palindrome

//		 System.out.println("entera aString is palindrome or not to check");
//		   Scanner sc = new Scanner (System.in);
//		   String Originl,Reverse ="";
//		   Originl=sc.nextLine();
//		   
//		   int length =Originl.length();
//		   
//		   for(int i=length-1;i>=0;i--) {
//			   Reverse=Reverse+Originl.length();
//		   }
//		   if(Originl.equals(Reverse)) {
//			   System.out.println("Given string is apalindrome");
//		   }
//		   else {
//			   System.out.println("Given string is not apalindrome");
//
//		   }
//		   

		// reverse the string

//		   System.out.println("enter a string a name");
//		   Scanner sc = new Scanner (System.in);
//		   String orginal,reverse="";
//		   
//		   orginal = sc.nextLine();
//		   
//		   int length = orginal.length();
//
//   for(int i=length-1;i>=0;i--) {
//	   reverse=reverse+orginal.charAt(i);
//   }
//   System.out.println("Reverse the given a string  -->  " +  reverse);

		// trinagle the star

//		  int n =5;
//		  
//		  for(int i=0;i<=n;i++) {
//			  for(int j=1;j<=n-i;j++) {
//				  System.out.print(" ");
//			  }
//			  for(int j=0;j<i;j++) {
//				  System.out.print(" * ");
//			  }
//			  System.out.println();
//
//		  }

//		int n,m,sum=0;
//		
//		m=123456789;
//		
//		while(m>0) {
//			n=m%10;
//			sum=sum+n;
//			m=m/10;
//		}
//         System.out.println("Sum of the given number   "+sum);

		//

//		  int sum=0;
//		   
//		  int m =12345;
//		  int sum=0;

//		  int arr[] = new int[4];

//		   while(m>0) {
//			   n=m%10;
//			   sum = sum+n;
//			   m=m/10;
//		   }
//		   System.out.println(sum);

//		   for(int sum = 0;m>0;m=m%10) {
//			 
//			    sum = sum*10 + m;
//		   }
//		  
//		
//		System.out.println(sum);

//		  while(m>0) {
//			  n=m%10;
//			  sum=sum+n;
//			  m=m/10;
//			  
//		  }
//		  System.out.println(sum);

//		   int rem =0;
//		  for(int sum=0;m>0;m=m/10) {
//			  rem=sum+m;
//			  rem = rem*10;
//		  }
//		  System.out.println(rem);
//		  if(rem == m) {
//		   System.out.println("it is a palindrome");
//		  }
//		  else {
//			  System.out.println("it is not a palindrome");
//		  }

//		   int n = 8;
//		   
//		   for(int i=0;i<n;i++) {
//			   for(int j=1;j<n-i;j++) {
//				   System.out.print(" ");
//			   }
//			   for(int j=0;j<i;j++) {
//				   System.out.print("* ");
//			   }
//			   System.out.println();
//		   }
//		  

//	String name ="yuva ammu usha priya muruga";
//	
//	String[] s1 = name.split(" ");
//	
//	HashMap<String , Integer>emp =  new HashMap<String, Integer>();
//	 
//	for(String c:s1) {
//		if(emp.containsKey(c)) {
//			int x = emp.get(c);
//			emp.put(c,x+1);
//		}
//		else {
//			emp.put(c, 1);
//		}
//	}
//	System.out.println(emp);

//		 String s="yuvaraj";
//		 
//		 HashMap<Character,Integer>emp = new HashMap<Character,Integer>();
//		   
//		   char [] ch = s.toCharArray();
//		   
//		  for(char c:ch) {
//			  if()
//		  }

//		String s = "yuva  yuva yuva yuva yuva ";
//		
//		String j =s.replace(" ", "");
//		System.out.println(j);
//		   
//		   
//		   

//		   System.out.println("Enter a reverse String");
//		   Scanner sc = new Scanner(System.in);
//		   String Orginal,Reverse="";
//		   Orginal=sc.nextLine();
//		   int length =Orginal.length();
//		   int i;
//		   for(i=length-1;i>=0;i--) {
//			   Reverse=Reverse+Orginal.charAt(i);
//			   
//		   }
//				  System.out.println(Reverse);

//		   for(int i=0;i<=4;i++) {
//			   for(int j=4;j>=0;j--) {
//				   if(j<=i) {
//					   System.out.print(i+" ");
//				   }
//				   else {
//					   System.out.print(" ");
//				   } 
//			   }
//			   System.out.println();
//		   }

//		   Scanner sc = new Scanner (System.in);
//		   System.out.println("Enter the number ");
//		   
//		   int noofrow = sc.nextInt();
//		   int count =1;
//		   
//		   for(int i=noofrow;i>=1;i--) {
//			   for(int j=1;j<=i*2;j++) {
//				   System.out.print(" ");
//			   }
//			   for(int j=i;j<=noofrow;j++) {
//				   System.out.print(j+" ");
//			   }
//			   for(int j=noofrow-1;j>=i;j--) {
//				   System.out.print(j+ " ");
//			   }
//			   System.out.println();
//			   count++;
//		   }
//		   
//		   

//		   
//System.out.println("Enter a String");
//		   Scanner sc = new Scanner (System.in);
//		   
//		   String orginal,reverse=" ";
//		   
//		   orginal=sc.nextLine();
//		   int length = orginal.length();
//		   
//		   for(int i=length-1;i>=0;i--) {
//			   reverse=reverse+orginal.charAt(i);
//		   }
//		   System.out.println(reverse);

//		   String x="yuva traja  uyub uin";
//		   
//		   String y =x.replace(" ", "");
//		   
//		   System.out.println(y);

//	   String x ="yuvaraj";
//	   HashMap<Character,Integer>emp = new HashMap<Character,Integer>();
//	   
//	   char[]ch=x.toCharArray();
//	   
//	   for(char c:ch) {
//		   if(emp.containsKey(c)) {
//			   int k = emp.get(c);
//			   emp.put(c, k+1);
//		   }
//		   else {
//			   emp.put(c, 1);
//		   }
//	   }
//	   System.out.println(emp);

//		int m =123456789;
//		
//		int n,sum=0;
//		
//		while(m>0) {
//			n=m%10;
//			sum=sum+n;
//			m=m/10;
//			
//		}
//		   
//		  System.out.println(sum); 

//		   
//		   System.out.println("Enter a number a to do triangle");
//		  Scanner sc = new Scanner(System.in); 
//		  
//		  int n=sc.nextInt();
//		   
//		  
//		  
//		for(int i=1;i<=n;i++) {		   
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}

//		   System.out.println("enter the string");
//		   Scanner sc = new Scanner(System.in);
//		   String orginal,reverse=" ";
//		   orginal=sc.nextLine();
//		   
//		   int length =orginal.length();
//		   
//		   for(int i=length-1;i>=0;i--) {
//			   reverse =reverse+orginal.charAt(i);
//		   }
//		   System.out.println(reverse);

//		  String Orginal,reverse="";
//		  Scanner sc = new Scanner (System.in);
//		  
//		  Orginal=sc.nextLine();
//		  int length = Orginal.length();
//		  
//		  for(int i=length-1;i>=0;i--) {
//			  reverse=reverse+Orginal.charAt(i);
//		  }
//		  if(reverse.equals(Orginal)) {
//			  System.out.println("it/s palindrome");
//		  }
//		  else {
//			  System.out.println("its'n not a palindrome");
//		  }

//		   Scanner sc = new Scanner(System.in);
//		   String orginal,reverse="";
//		   
//		   orginal=sc.nextLine();
//		   
//		   int length = orginal.length();
//			   for(int i=length-1;i>=0;i--) {
//				   reverse=reverse+orginal.charAt(i);
//				   
//			   }
//			   System.out.println(reverse);
//		   }

//		 int k= 1234567890;
//		 int m=0;
//		 
//		 while(k>0) {
//			 k=k/10;
//			 m++;
//			 
//		 }
//		   System.out.println(m);

//		   int a =0;
//		   int b=0;
//	int c =0;
//		   int d =0;
//		   
//		   String k = "Hi Welcome To Java Classes Tommorow At 2.00 p.m!!"; 		   
//		   for(int i=0;i<k.length();i++) {
//			   
//			   if(k.charAt(i)>='a' && k.charAt(i)<='z'){
//				   a++;
//			   }
//			   
//			   else if (k.charAt(i)>='A' && k.charAt(i)<='Z') {
//				   b++;
//			   }
//			   else if(k.charAt(i)>='0' && k.charAt(i)<='9') {
//						   c++;
//						   
//					   }
//			   else {
//				   d++;
//			   }
//				   }
//		   System.out.println("small" + a);
//		   System.out.println( "capital" +  b);
//		   System.out.println( "number" + c);
//		   System.out.println(d);
//	   }

//		  int n[]= {-1,-2,-3,-4,1,2,3,4};
//		  
//		  for(int i=0;i<n.length;i++) {
//			  for(int j=i+1;j<n.length;j++) {
//				  int temp =0;
//				  
//				  if(n[i]<n[j]) {
//                   temp =n[i];					 
//                   n[i]=n[j];
//                   n[j]=temp;
//				  }
//				  for(int k=0;k<n.length;k++) {
//					 System.out.println(n[k]); 
//				  }
//			  }
//		  }
//		  System.out.println( "min number :" +n[n.length-1]);
//		  System.out.println( "min number :" +n[n.length-5]);
//		  System.out.println( "min number :" +n[n.length-8]);
//
//		  
//		   

		// int n[]= {1,2,3,4,5};

//		   Scanner sc = new Scanner (System.in);
//		   System.out.println("enter how many element you want");
//		   
//		   int n,temp=0;
//		   
//		   n=sc.nextInt();
//		   
//		   int a[]=new int [n];
//		   
//		   for(int i=0;i<n;i++) {
//			   a[i]=sc.nextInt();
//		   }
//		   for(int i=0;i<n;i++) {
//			   for(int j=i+1;j<n;j++) {
//				   
//				   if(a[i]>a[j]) {
//					   temp=a[i];
//					   a[i]=a[j];
//					   a[j]=temp;
//				   }
//			   }
//		   }
//		   for(int i=n-1;i>0;i--) {
//			   System.out.print(a[i] +" ,");
//		   }
//		   
//		   System.out.print(a[0]);
//		   

//		   Scanner sc = new Scanner(System.in);
//		   System.out.println("enter a number how many element u want");
//		   int n,temp=0;
//		   
//		   n=sc.nextInt();
//		   
//		   int a[]=new int [n];
//		   
//		   for(int i=0;i<n;i++) {
//			   a[i]=sc.nextInt();
//		   }
//		   
//		   for(int i=0;i<n;i++) {
//			   for(int j=i+1;j<n;j++) {
//				  if(a[i]>a[j]) {
//					  temp=a[i];
//					  a[i]=a[j];
//					  a[j]=temp;
//				  }
//			   }
//			   
//		   }
//		   for(int i=0;i<n-1;i++) {
//			   System.out.print(a[i] + ",");
//		   }
//		   System.out.print(a[n-1]);
//		   

//		  String n="yuvaraj";
//		  
//		  int Vowels =0;
//		  int nonVowels=0;
//		  
//		  for(int i=0;i<n.length();i++) {
//			  char ch=n.charAt(i);
//			  if(ch=='A'|| ch=='a'|| ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
//				  Vowels++;
//			  }
//			  else {
//				  nonVowels++;
//			  }
//		  }
//		  System.out.println(Vowels);
//		  System.out.println(nonVowels);
//		   

//		   Scanner sc = new Scanner(System.in);
//		   
//		   int a=sc.nextInt();
//		   int b=sc.nextInt();
//		   int c=sc.nextInt();
//		   int d=sc.nextInt();
//		   
//		   if(a>b&&a>c&&a>d) {
//			   System.out.println("biggest numbr" + a);
//		   }
//		   if(b>a&&b>c&&b>d) {
//			   System.out.println("biggest numbr" + b);
//		   }
//		   if(c>a&&c>b&&c>d) {
//			   System.out.println("biggest numbr" + c);
//		   }
//		   if(d>a&&d>b&&d>c) {
//			   System.out.println("biggest numbr" + d);
//		   }
//		   
//		   
//		   

//		   Scanner sc = new Scanner (System.in);
//		   int n=sc.nextInt();
//		   int b=sc.nextInt();
//		   
//		   for(int i=1;i<=10;i++) {
//			   int c=i*n;
//			   
//			   System.out.println(n + " *" +i+ " = " +c);
//		   }

//		   int n=20;
//		   
//		   for(int i=1;i<=10;i++) {
//			   int c=i*n;
//			   System.out.println(n + " *"+ i+ " = " + c);
//			   
		// }
		
		//triangle
		
//		int n=10;
//		
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i;j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<=10;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		
//		int c =0;
//		
//		for(int n=1;n<=1000;n++) {
//			int a,i=0,j=0;
//			a=n;
//			while(a>0) {
//				i=a%10;
//				j=j+(i*i*i);
//				a=a/10;
//			}
//			if(n==j) {
//				c++;
//			}
//		}
//		
//		System.out.println(c);
		
	
//		int n=10;
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i;j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//
//		}
		
//		int a=0;
//		int b=1;
//		
//		for(int i=1;i<=10;i++) {
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		
		
		
	}
}
