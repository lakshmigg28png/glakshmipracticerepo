package JavaProgramassignment;
abstract class Animal{
	abstract void sound();
	
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog bow bow");
		
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat meow meow");
		
	}
}
public class Abstarct {
public static void main(String[] args) {
	Animal dog = new Dog();
	Animal cat  =new Cat();
	dog.sound();
	cat.sound();
}
}
