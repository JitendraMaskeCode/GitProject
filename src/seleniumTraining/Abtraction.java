package seleniumTraining;

public class Abtraction {
	public static void main(String[] args) {
		Junior j = new Junior();
		j.exam();
		j.placement();
		
		Senior j1 = new Junior();
		j1.placement();
	}

}

abstract class Senior{
	
	void exam() {
		System.out.println("Senior exam method");
	}
	abstract void placement();
}

class Junior extends Senior{

	@Override
	void placement() {
		System.out.println("Junior Placement");
		
	}
	void exam() {
		System.out.println("Junior exam method");
	}
	
}