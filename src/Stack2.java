import java.util.*;
public class Stack2 {
	//PRINT SUM OF ELEMENTS OF ARRAY!!!!!!!!!!
	//
//	void array_sum() {
//		int arr[]= {3,4,9,10};
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			
//			sum=sum+arr[i];
//			
//		}
//		System.out.print(sum);
//	}

  //PRINT MAX OF ARRAY ELEMENTS
//	  void max() {
//		  int arr[]= {10,8,9,7,60};
//		  int age=0;
//		  for(int i=0;i<arr.length;i++) {
//			  if(arr[i]>age) {
//				  age=arr[i];
//			  }
//		  }
//		  System.out.print(age);
//	  }
//	
	
	
	
	//SEARCH GIVEN NUMBER IN ARRAY AND RETURN ITS INDEX ELSE RETURN -1;
	//linear search:
	void array() {
		 int arr[]= {10,7,8,9,7,60};
		 int x=7;
		 int ans=-1;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==x) {
				 ans=i;
				 break;
			 }
		 }
		 
		 System.out.print("found "+ x+" at index:"+ans);
	}
	public static void main(String[] args) {
			Stack2 obj=new Stack2();
			obj.array();

	}

}
