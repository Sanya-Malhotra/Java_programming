package Arrays;
import java.util.*;

public class PrefixsumArray {
//	static int[]sum(int[]arr){
//		int n=arr.length;
//		int[]pref=new int[n];
//		pref[0]=arr[0];
//		for(int i=1;i<n;i++) {
//			pref[i]=pref[i-1]+arr[i];
//		}
//		return pref;
//		
//	}
	
	//METHOD 2
	static int[] sum(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]+arr[i-1];
			
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
//		sum(arr);
		//int[]pref=sum(arr);
		sum(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
