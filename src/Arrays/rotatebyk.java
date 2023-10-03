package Arrays;
import java.util.*;


public class rotatebyk {
	static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	static void reverse(int []arr,int i,int j) {
//		int i=0;
//		int j=arr.length-1;
		while(i<j) {
			swap(arr,i,j);
			i++;
			j--;
			
		}
	}
		static void rotateInPlace(int[]arr,int k) {
			int n=arr.length;
			k=k%n;
			reverse(arr,0,n-k-1);
			reverse(arr,n-k,n-1);
			reverse(arr,0,n-1);
			
			
			
			
		}
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		System.out.println("enter array :");
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter k :");
		int k=sc.nextInt();
		
	rotateInPlace(arr,k);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
		

	}

}
