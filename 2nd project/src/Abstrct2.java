abstract class Kilo{
	int c;
	int d;
	abstract void m2(int a,int b);
	abstract void m3();
	
	
}
class Den extends Kilo{
	void m2(int a,int b) {
		c=a;
		d=b;
		System.out.println(c);
		System.out.println(d);
		
	}
	void m3() {
		System.out.println("hello2");
		
	}
	
}

	

public class Abstrct2 {

	public static void main(String[] args) {
	Den o=new Den();
	o.m2(20, 30);
	o.m3();
	
	

	}

}
