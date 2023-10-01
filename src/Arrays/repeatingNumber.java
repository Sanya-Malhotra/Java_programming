package Arrays;
import java.util.*;

public class repeatingNumber {
	
	static int repeat(int []arr) {
		for(int i=0;i<arr.length;i++) {//first number
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("the first repeating number is:"+ repeat(arr));
		
		

	}

}
