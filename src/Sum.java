import java.util.*;
public class Sum {
	public static void main( String arg[] ) {
//		Scanner input = new Scanner (System.in);
//		int size = input.nextInt();
//		int arr[];
//		arr = new int [5];
//		int n=0;
//		for(int i=0;i<=n;i++) {
//			arr[i] = input.nextInt();
//		}
//		
//		Sum obj = new Sum();
//	}
		
		
		int num=98765;
		int count=0;
		while(num!=0) {
			int rem=num%10;
			count=count*10+rem;
			num=num/10;
		}
		System.out.print(count);
	
}
}

