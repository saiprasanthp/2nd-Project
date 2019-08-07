interface Sd{
	void m1();
	void m2();
	
	
}
class Hp implements Sd{
	public void m1() {
		System.out.println("hello world");
		
	}
	public void m2() {
		System.out.println("hello world 2");
		
	}
	
}
public class Interfce8 {

	public static void main(String[] args) {
		//Sd t=new Hp();
		//t.m1();
		//t.m2(); 
		
		
		 
		Sd t;
		t=new Hp();
		t.m1();
		t.m2();
		
		
		

	}

}
