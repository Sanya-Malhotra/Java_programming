package Arrays;
import java.util.*;
//to find the unique number in given array if every other numbers have their pair in array " positive number only"

public class uniqueNumber {
	
	static int Unique(int[] arr) {
		int n=arr.length;
		//first number of pair
		for(int i=0;i<n;i++) {
			//second number of pair
			for(int j=i+1;j<n;j++) {
				//condition 
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		
		//last loop for unique number
		int ans=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				ans=arr[i];
				
			}
		}
		return ans;
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
		
		System.out.print("the unique number is :"+ Unique(arr));
		
		
		
		

	}

}
