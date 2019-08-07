class If1{
	void m1() {
		int number=3;
		if(number%2==0) {
			System.out.println("it is even number");
		}
		else {
			System.out.println("it is odd number");
		}
	}
	
}
public class IfElse1 {

	public static void main(String[] args) {           //by object creation method
		If1 d=new If1();
		d.m1();

	}

}
