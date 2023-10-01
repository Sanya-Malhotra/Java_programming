
package Arrays;
import java.util.*;

public class Lastoccurence {
	
	static int lastindex(int[]arr,int x) {
		
		int last=-1;
		//traverse
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				last=i;
				
			}
		}
		return last;
		
		
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
		//element to find its index
		System.out.println("enter the element:");
		int x=sc.nextInt();
		
		System.out.print(lastindex(arr,x));

	}

}
