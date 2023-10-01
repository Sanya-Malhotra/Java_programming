package Arrays;
import java.util.*;


public class strictlygreaterthan {
	
	static int greater(int[]arr,int x) {
		int count=0;
		//traverse
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				count++;
			}
		}
		
		
		return count;
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
		//element to find its strictly greater than
		System.out.println("enter the element:");
		int x=sc.nextInt();
		
		System.out.println(greater(arr,x));

	}

}
