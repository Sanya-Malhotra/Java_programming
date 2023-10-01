package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class kthMinMax {
     static int min(int[] arr,int k) {
    	 Arrays.sort(arr);
    	 return arr[k-1];
    	 	
     }
     static int max(int[] arr,int k) {
    	 Arrays.sort(arr);
    	 return arr[arr.length-k];
    	 	
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
		//index
		System.out.println("enter k:");
		int k=sc.nextInt();
		int min=min(arr,k);
		int max=max(arr,k);
		
		System.out.println("kth smallest element:" + min);
		System.out.println("kth largest element:" + max);
	

	}

}
