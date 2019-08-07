class Dm2{
	void m1() {
		System.out.println("hello m1");
		
	}
	
}
class Mik extends Dm2{
	void m2() {
		System.out.println("hello m2");
		
	}
	
}
class Fx extends Mik{
	void m3() {
		System.out.println("hello m3");
		
	}
	
}
class Gf1 extends Fx{
	void m4() {
		System.out.println("hello m4");
		
	}
	void m5() {
		System.out.println("hello m5");
		
	}
	
}
public class MyExtend1 {

	public static void main(String[] args) {
		Gf1 j=new Gf1();
		j.m4();
		j.m5();
		j.m3();
		j.m1();
		j.m2();
		
		

	}

}
