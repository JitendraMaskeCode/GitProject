package seleniumTraining;

public class InterfaceExample {

	public static void main(String[] args) {
		Impl i1 = new Impl();
		i1.m1();
		i1.m2();
		i1.m3();

		I1 i2 = new Impl();
		i2.m1();
		i2.m2();
		i2.m3();
	}

}

interface I1{
	void m1();
	void m2();
	void m3();
}

class Impl implements I1{

	@Override
	public void m1() {
		System.out.println(" m1");
		
	}

	@Override
	public void m2() {
		System.out.println(" m2");
		
	}

	@Override
	public void m3() {
		System.out.println(" m3");
		
	}
	
}