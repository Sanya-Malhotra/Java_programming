
public class MaxSubarraysum {
	
//	public static void Sum(int numbers[]) {
//		int currentsum=0; 
//		int max=0;
//		
//	      //start
//		
//		for(int i=0;i<=numbers.length;i++) {
//			
//			//end////////////
//			for(int j=i;j<numbers.length;j++){
//				
//				currentsum=0;
//				//for printing numbers b/w start and end
//				
//				for(int k=i;k<=j;k++) {
//			       
//					currentsum += numbers[k];
//				}
//				System.out.println(currentsum);
//				if(max <currentsum) {
//					max=currentsum;
//				}
//				
//				
//			}
//			
//		}
//		System.out.println("maximum sum :"+ max);
//	}
//
//	public static void main(String[] args) {
//		int numbers[]= {2,4,6,8,10};
//		Sum(numbers);
//		
//
//	}
	
	
	public static void Prefix(int numbers[]) {
		int currentsum=0;
		int max=0;
		int prefix[]=new int[numbers.length];
		prefix[0]=numbers[0];
		//calculate prefix array
		for(int i=1;i<prefix.length;i++) {
			prefix[i] = prefix[i-1]+numbers[i];
		}
		
		   
		for(int i=0;i<numbers.length;i++) {
			int start=i;
			for(int j=i;j<numbers.length;j++) {
				int end=j;
				currentsum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
				if(max<currentsum) {
					max=currentsum;
				}
			}
		}
		System.out.println("max sum= "+ max);
		
	}
	
	public static void main(String[] args) {
		
		int numbers[]= {2,4,6,8,10};
		Prefix(numbers);
		
		
	}

}
