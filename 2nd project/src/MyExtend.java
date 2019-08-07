abstract class Dm{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4() {
		System.out.println("hello4");
		
	}
	
}
abstract class Klm extends Dm{
	void m6() {
		System.out.println("hello6");
		
	}
	
}
abstract class Gvk extends Klm{
	abstract void m5();
	
	
}
class Vrk extends Gvk{
	void m1() {
		System.out.println("hello1");
		
	}
	void m2() {
		System.out.println("hello2");
		
	}
	void m3() {
		System.out.println("hello3");
		
	}
	void m5() {
		System.out.println("hello5");
		
	}
	
}
public class MyExtend {

	public static void main(String[] args) {
		Vrk g=new Vrk();
		g.m1();
		g.m2();
		g.m3();
		g.m4();
		g.m5();
		g.m6();
		

	}

}
