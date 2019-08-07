interface It1{
	void m1();
	
}
interface It2 extends It1{
	void m2();
	
}
interface It3 extends It2{
	void m3();
	
}
class M implements It2{
	public void m1() {
		System.out.println("by using multiple inheritance");
		
	}
	public void m2() {
		System.out.println("by using m2 method");
		
	}
	public void m3() {
		System.out.println("m3 method");
		
	}
}
public class Interfce5 {

	public static void main(String[] args) {
		M t=new M();
		t.m1();
		t.m2();
		t.m3();

	}

}
