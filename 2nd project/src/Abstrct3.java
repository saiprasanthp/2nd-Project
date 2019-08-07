abstract class Jp{
	abstract void f1();
	abstract void f2();
	void m4() {
		System.out.println("hello guru");
	}
	
	
}
abstract class Gb extends Jp{
	void f() {
		System.out.println("hello");
		
	}
	
}
class Sw extends Gb{
	void f1() {
		System.out.println("hello2");
		
	}
	void f2() {
		System.out.println("hello3");
		
	}
	
}
public class Abstrct3 {

	public static void main(String[] args) {
		Sw o=new Sw();
		o.f1();
		o.f2();
		Gb k=new Sw();
		k.f();
		k.f2();
		Jp m;
		m=new Sw();
		m.m4();
		m.f2();

	}

}
