package oopsAssignments;

public class Shape24 {
	double length;

    public Shape24(double length) {
        this.length = length;
    }

    public double square() {
        return length * length;
    }

      public double rectangle(double breadth) {
        return length * breadth;
    }

    
    public double circle() {
        return Math.PI * length * length;
    }

    public static void main(String[] args) {
        Shape24 shape = new Shape24(5.0);

        System.out.println("Area of Square: " + shape.square());
        System.out.println("Area of Rectangle: " + shape.rectangle(4.0));
        System.out.println("Area of Circle: " + shape.circle());
    }
}

