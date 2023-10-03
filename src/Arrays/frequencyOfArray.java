package Arrays;
import java.util.*;

public class frequencyOfArray {
	static int [] frequencyarray(int []arr) {
		int [] freq=new int[100005];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
		 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		System.out.println("enter array :");
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[]freq=frequencyarray(arr);
		System.out.println("enter number of queries :");
		int q=sc.nextInt();
		
		while(q>0) {
			System.out.println("enter number to search :");
			int x=sc.nextInt();
			if(freq[x]>0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			
			q--;
		}
		

	}

}
