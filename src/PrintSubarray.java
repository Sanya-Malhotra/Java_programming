
public class PrintSubarray {
	
	public static void Subarray(int numbers[]) {
		int ts=0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++) {
				for(int k= i;k<=j;k++) {
					System.out.print(numbers[k]+" ");
					ts++;
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("total number of subarray is :" + ts);
	}

	public static void main(String[] args) {
	/* array={2,3,4,5,6}
		subarray={2,3,4} ------> this is correct
		{2,4,5}-------> this is wrong because  it is not continuous as it skipped the 3*/
		
         int numbers[]= {2,4,6,8,10};
         
         Subarray(numbers);
	}

}
