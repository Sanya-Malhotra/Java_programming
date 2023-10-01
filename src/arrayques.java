import java.util.*;



public class arrayques {
	
	
	static void Occurence(int[]arr,int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
				
			}
			
//			else {
//				count=-1;
//			}
			
		}
		System.out.print(count);
		
		
		
	}
	
	public static void main(String[]args) {
		int []arr= {5,6,5,4,5};
		int x=5;
		
		Occurence(arr,x);
		
		
	}

}
