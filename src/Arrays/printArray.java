package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class printArray {
	
	static int[]small(int[]arr){
		Arrays.sort(arr);
		int[]ans= {arr[0],arr[arr.length-1]};
		return ans;
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
		int[]ans=small(arr);
		
		//output
		System.out.println("smallest element:"+ans[0]);
		System.out.println("largest element:"+ans[1]);
		
	

	}

}
