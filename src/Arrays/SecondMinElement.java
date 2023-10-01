package Arrays;

import java.util.*;

public class SecondMinElement {
	//function for min element
	static int min(int[]arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
		
	}

	//second function for 2nd min element
	
	static int findmintwo(int[]arr) {
		int min=min(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==min) {
				arr[i]=Integer.MAX_VALUE;
				
			}
			
		}
		int secondmin=min(arr);
		return secondmin;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter number of elements:");
		int x=sc.nextInt();
		int []arr=new int[x];
		System.out.print("enter array:");
		//input
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("the 2nd  min element is:"+findmintwo(arr));


	}

}
