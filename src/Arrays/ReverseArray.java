package Arrays;

import java.util.Scanner;
import java.util.*;

public class ReverseArray {
	/*method 1
	 static int[] swap(int []arr,int n){
		 //reverse traverse on array
		 int ans[]=new int[n];
		 int j=0;
		 for(int i=n-1;i>=0;i--) {
			 ans[j++]=arr[i];
		 }
		 return ans ;
		 
	 }
	 */
	
	//METHOD 2
	
	static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void reverse(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			swap(arr,i,j);
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("enter array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
