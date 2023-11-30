package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		//ADD ELEMENTS
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		//print arraylist
		System.out.println(list1);
		
		//Get element
		int element=list1.get(2);
		System.out.println(element);
		
		//ADD ELEMENT IN MIDDLE / AT ANY INDEX
		
		list1.add(2,10);
		System.out.println(list1);
		
		//SET ELEMENT
		list1.set(1, 6);
		System.out.println(list1);
		
		//DELETE ELEMENT 
		list1.remove(1);
		System.out.println(list1);
		
		//Size
		System.out.println(list1.size());
		
		//Loop
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
			
		}
		System.out.println();
		
		//sorting
		Collections.sort(list1);
		System.out.println(list1);
		
		
		
		

	}

}
