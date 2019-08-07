abstract class Intel{
	abstract void m1();
	abstract void  m2();
	
}
abstract class Wipro extends Intel{
	void m3() {
		System.out.println("this is the m3 method");
		
	}
}
class Ms extends Wipro{
	void m1() {
		System.out.println("this is the abstract,non abstract method example");
		
	}
	void m2() {
		System.out.println("this is the m2 method");
		
	}
	
}

public class MyPractise4 {

	public static void main(String[] args) {
		Ms t=new Ms();
		t.m1();
		t.m2();
		t.m3();

	}

}
