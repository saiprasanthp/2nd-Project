abstract class Us{
	abstract void m1();
	abstract void  m2();
	
	
}
class India extends Us{
	void m1() {
		System.out.println("the is the abstract method practise");
		
	}
	void m2() {
		System.out.println("this is the abstract method practise2");
		
	}
	
}
public class MyPractise3 {

	public static void main(String[] args) {
		India i=new India();
		i.m1();
		i.m2();

	}

}
