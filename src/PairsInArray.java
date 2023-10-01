
public class PairsInArray {
	
	public static void Pairs(int numbers[]) {
		int tp=0;
		//LOOP FOR SELECTING THE NUMBER
		for(int i=0;i<numbers.length;i++) {
			int current = numbers[i];
			//LOOP FOR PRINTING THE PAIR OF THE SELECTED NUMBER WITH REST NUMBERS 
			for(int j=i+1;j<numbers.length;j++) {
				System.out.print("(" + current+","+numbers[j] +")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("total pairs = "+ tp);
	}

	public static void main(String[] args) {
	       int numbers[]= {2,4,6,8,10};
	       Pairs(numbers);
	       
	      //FORMULA OF TOTAL NUMBER OF PAIRS=N(N-1)/2
	       //TOTAL PARIS QUESTION IS IMPORTANT
	       

	}

}
