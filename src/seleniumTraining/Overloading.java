package seleniumTraining;

public class Overloading {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.add(20,30);
		a.add(12, 20, 28);
	}

}

class A{
	
	void add(int x, int y) {
		System.out.println("additon of two no is: "+(x+y));
	}
	void add(int x, int y,int z) {
		System.out.println("additon of two no is: "+(x+y+z));
	}
}