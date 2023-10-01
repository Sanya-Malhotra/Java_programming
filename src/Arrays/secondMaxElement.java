package Arrays;
import java.util.*;
public class secondMaxElement {
	
	static int findmax(int[]arr) {
		int max=Integer.MIN_VALUE;
		//to find max element
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	static int findmaxtwo(int []arr) {
		int max=findmax(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				arr[i]= Integer.MIN_VALUE;
			}
		}
		
		int secondmax= findmax(arr);
		
		return secondmax;
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
		
		System.out.print("the 2nd  max element is:"+findmaxtwo(arr));

	}

}
