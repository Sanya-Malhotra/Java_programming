import java.util.Scanner;

public class Stack {

	int top;
	int maxsize =5;
	int arr[] = new int[maxsize];
	boolean isEmpty() {
		return (top <0);
		
	}
	Stack (){
		top = -1;
	}
	boolean push (Scanner sc) {
		if(top ==maxsize-1) {
			System.print.out("overflow !!");
			return false;
		}
		else
		{
			System.out.print("enter value");
			int val = sc.nextInt();
			top++;
			arr[top]= val;
			System.out.println("item pushed");
			return true;
		}
	}
	
	
	
	
	public static void main(String[] args) {
	

	}

}
