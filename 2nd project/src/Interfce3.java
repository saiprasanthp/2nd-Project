interface It{
	void m1();
	void m2();
	void m3();
	
}
abstract class Hf implements It{
	public void  m1() {
		System.out.println("hello");
	}
	
}
abstract class Up extends Hf{
	public void  m2() {
		System.out.println("hello2");
	}
}
class Mj extends Up{
	public void m3() {
		System.out.println("hello3");
	}
}

public class Interfce3 {

	public static void main(String[] args) {
		Mj t=new Mj();
		t.m3();
		t.m2();
		t.m1();

	}

}
