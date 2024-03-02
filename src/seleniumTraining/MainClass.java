package seleniumTraining;

public class MainClass{
	public static void main(String[] args) {
		Details d = new Details();
		d.m1();
		d.m2();
		d.m3();
	}
}

class Employee {

	int no;
	String name;
	void m1() {
		System.out.println(" Employee method");
	}
	
}

class Address extends Employee{
	String address;
	void m2() {
		System.out.println(" Address method");
	}
}
class Details extends Address{
	
	int mobileNo;
	void m3() {
		System.out.println(" Details method");
	}
}