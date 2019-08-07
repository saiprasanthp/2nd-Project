interface Az{
	int a=10;
	abstract public void m1();
	
	
	
}
class Ko implements Az{
	public void m1() {
		System.out.println("this is the interface example ");
	}
	
}
public class MyPractise5 {

	public static void main(String[] args) {
		Ko g=new Ko();
		g.m1();
		System.out.println(g.a);

	}

}
