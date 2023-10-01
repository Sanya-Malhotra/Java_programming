
public class Box {

	int height;
	int width;
	String type_box;
	boolean bool;
	Box(){
		height = 5;
		width = 5;
		System.out.println(" new object created");
	}
	public static void main( String args[] )
	{
		Box cube = new Box();
		int i =20;
		Box cuboid;
		cuboid = new Box();
		System.out.print(i);
		System.out.println(cube.height+" "+cube.width+" "+ cube.type_box );
		System.out.println(cube.bool);
	}
	
}
