abstract class Person1{
	abstract void m1();
	
	
}
class Student2 extends Person1{
	void m1() {
		System.out.println("hello");
		
	}
	
}
class Asap extends Person1{
	void m1() {
		System.out.println("hello2");
		
	}
	
}
public class Inter1 {

	public static void main(String[] args) {
		Person1 b;
		b=new Student2();
		b.m1();
		b=new Asap();
		b.m1();

	}

}
