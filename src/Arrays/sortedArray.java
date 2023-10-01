package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class sortedArray {
	
	static boolean isSorted(int[]arr) {
		boolean check=true;
		//traverse 
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				check=false;
				break;
			}
		}
		return check;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.print("enter the elements:");
		//input
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		//output
		System.out.print("is array sorted:"+ isSorted(arr));

	}

}
