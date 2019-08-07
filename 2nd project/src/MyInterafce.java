interface Po{
	abstract public void m1();
	abstract public void m2();
	
	
}
abstract class Dc implements Po{
	public void m1() {
		System.out.println("this is the defined method");
		
	}
	
	
}
class Kh extends Dc{
	public void m1() {
		super.m1();
		
		System.out.println("this is the abstract method");
	}
	public void m2() {
		System.out.println("this is the extension of abstract class");
	}
	
}
public class MyInterafce {

	public static void main(String[] args) {
		Kh b=new Kh();
		b.m1();
		b.m2();
		Dc o=new Kh();
		o.m1();
		o.m2();
		Po g=new Kh();
		g.m1();
		g.m2();

		

	}

}
