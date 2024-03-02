package seleniumTraining;

public class SingleInheritance {
public static void main(String[] args) {
	ChildClass c = new ChildClass();
	c.eat();
	c.run();
	System.out.println(c.bal);
	System.out.println();
	
}
}

class Parent {
	int bal =2000;
	String car;
	
	void eat() {
		System.out.println("Parent- I am eating");
	}

	void run() {
		System.out.println("Parent- I am running");
	}
}

class ChildClass extends Parent {
	int bal =1000;
	String car;
	
	void eat() {
		System.out.println("Child- I am eating");
	}

	void run() {
		System.out.println("Child- I am running");
	}
}

