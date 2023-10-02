package Arrays;
import java.util.*;


public class lastRepeating {
	static int repeat(int[]arr) {
		int n=arr.length;
		int last=-1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					last=arr[i];
				}
			}
		}
		return last;
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
			int last=repeat(arr);
			if(last!=-1) {
		       System.out.println("the last repeating element is:"+repeat(arr));
	        }
			else {
				System.out.println("no duplicate found");
			}

}
}
