package Arrays;
import java.util.*;


public class Targetsum {
	
	static int sum(int []arr,int t) {
		int ans=0;
		//outer loop
		for(int i=0;i<arr.length;i++) {
			//inner loop
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==t) {
					ans++;
				}
			}
		}
		return ans;
		
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
		System.out.println("enter t:");
		int t=sc.nextInt();
    System.out.println("the number of target sum are:"+ sum(arr,t));
	}

}
