package seleniumTraining;

public class Dog {

	int legs;
	String color="white";
	

	void jump() {
		System.out.println("Dog is jumping");
	}
	void eats() {
		System.out.println("Dog is eating");
	}
	public static void main(String[] args) {
		
		
		Dog d = new Dog();
		d.jump();
		d.eats();
		System.out.println("color of dog is "+ d.color);
		System.out.println(d.legs);

	}

}
