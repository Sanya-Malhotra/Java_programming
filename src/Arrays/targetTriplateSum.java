package Arrays;

import java.util.Scanner;

public class targetTriplateSum {
	
	static int sum(int []arr,int t) {
		int ans=0;
		
		//first element
		for(int i=0;i<arr.length;i++) {
			//second element
			for(int j=i+1;j<arr.length;j++) {
				//third element
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==t) {
						ans++;
					}
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


