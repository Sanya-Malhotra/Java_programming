import java.util.Scanner;

public class Box2 {

	double height;
	double width;
	double depth;
	String type_box;
	boolean bool_full;
	Box2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the type of box");
		this.type_box = sc.nextLine ();
		System.out.print("enter the height , width and depth of box");
		this.height = sc.nextDouble();
		
		width = 5;
		System.out.println(" new object created");
	}
	public static void main( String args[] )
	{
		Box square = new Box();
		
 }
