package oopsAssignments;
class Camera {
    public void capture() {
        System.out.println("Camera: Capturing image...");
    }
}
class DSLRCamera extends Camera {
   
    public void capture() {
        System.out.println("new Camera: Capturing high-quality image...");
    }
}

public class Polymorphism {
	 public static void main(String[] args) {
	      
	        Camera camera = new DSLRCamera();
	        
	       camera.capture();
	    }
}
