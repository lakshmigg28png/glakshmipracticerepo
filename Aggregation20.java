package oopsAssignments;
class Engine1 {
    void engineInfo() {
        System.out.println("Engine details: 4-cylinder, 2.0L");
    }
}

// Car class that has an Engine object (aggregation)
class Car {
    Engine1 engine; // Has-A relationship (aggregation)

    // Constructor to initialize Engine
    Car(Engine1 engine) {
        this.engine = engine;
    }

    void showEngineDetails() {
        engine.engineInfo(); // Using Engine's method
    }
}

public class Aggregation20 {
	public static void main(String[] args) {
        Engine1 engine = new Engine1(); // Create Engine object
        Car car = new Car(engine);    // Pass Engine to Car (aggregation)
        car.showEngineDetails();      // Display engine info
    }
}
