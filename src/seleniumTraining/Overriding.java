package seleniumTraining;

public class Overriding {
	
	public static void main(String[] args) {
		
		C a = new C();
		a.calculate(20);
		
		B b = new C();
		b.calculate(20);
		
		B b1 = new B();
		b1.calculate(20);
		
		C b2 = new C();
		b2.calculate1(20);
		
		B b3 = new C();
		b3.calculate1(20);
	}

}

class B{
	
	void calculate(int x) {
		System.out.println("square of x is : "+x);
	}
	static void calculate1(int x) {
		System.out.println("square of x is : "+x);
	}
}
class C extends B{
	
	void calculate(int x) {
		System.out.println("square root of x is : "+Math.sqrt(x));
	}
	static void calculate1(int x) {
		System.out.println("square root of x is : "+Math.sqrt(x));
	}
}