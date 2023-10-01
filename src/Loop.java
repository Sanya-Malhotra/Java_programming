import java.util.*;

public class Loop {
	

	public static void main(String args[]){
		/*for (int i = 100;i<=150;i++) {
			   System.out.println(i);
		   }
   
		int i = 1;
		while (i <=100) {
			 System.out.println(i);
			 i++;
			 
		}
		
		int i = 1;
		do {
			 System.out.println(i);
			 i++;
		}while(i<=20);
	}
		//TO PRINT THE SUM OF FIRST N NATUAL NUMBERS :---
		
		System.out.println("enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		 int sum = 0;
		for (int i = 0; i<=n;i++) {
			sum= sum +i;
		}
		System.out.print(sum);
		
		
		 System.out.println("enter the table number :");
		 Scanner sc =new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i= 0;i<=10;i++) {
			 System.out.println(i*n );
		 }
		//PRINT EVEN NUMBER TILL N:-----
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<=n;i++) {
			if(i%2 == 0) {
				 System.out.println(i);
			}
			else continue;
		}
		for(; ;) {
			 System.out.println("sanya");
		}
		
		// MENU DRIVEN PRGRAM FOR PRINTING MARKS :----
		System.out.print("enter the number either 0 or 1 :");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if (num ==0) {
    		System.out.print("stop");
    	}
    	
        	do {
        		Scanner s=new Scanner(System.in);
        		int marks = s.nextInt();
        		if (marks >=90) {
            		System.out.print("this is good");
            		
            	}
            	else if (marks <=89 && marks>=60 ) {
            		System.out.print("this is also good");
            	}
            	else if (marks <= 59 && marks >=0) {
            		System.out.print("this is good as well");
            	}
        		
        	}while(num == 1);
		
		
//		// TO CHECK WHETHER A NUMBER IS PRIME OR NOT :----
//		System.out.print("enter the number");
//		Scanner sc=new Scanner(System.in);
//		int n = sc.nextInt();
//		int count = 0;
//		for (int i=1; i<= n; i++) {
//			if(n%i ==0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.print("prime");
//		}
//		else {
//			System.out.print("non prime");
//		}
//		
        	
        
		 */
		System.out.print("enter the number either 0 or 1 :");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if (num ==0) {
    		System.out.print("stop");
    	}
        System.out.print("enter marks");
    	
        	do {
        		
        		Scanner s=new Scanner(System.in);
        		int marks = s.nextInt();
        		if (marks >=90) {
            		System.out.print("this is good");
            		
            	}
            	else if (marks <=89 && marks>=60 ) {
            		System.out.print("this is also good");
            	}
            	else if (marks <= 59 && marks >=0) {
            		System.out.print("this is good as well");
            	}
        		
        	}while(num == 1);
}
}
