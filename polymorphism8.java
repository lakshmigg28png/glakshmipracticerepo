package JavaProgramassignment;
class Shape {
	void area() {
		System.out.println("This is the area of shape.");
		
	}
}
class Rectangle extends Shape{
	void area() {
		System.out.println("The area of Rectangle is length * breadth.");
			
	}
}
class circle extends Shape{
	void area() {
		System.out.println("The area of circle is radius*length.");
		
	}
}
public class shapedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape shape;
shape=new Rectangle();
shape.area();
shape=new circle();
shape.area();

	}

}
