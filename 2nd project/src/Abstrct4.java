abstract class Pogo{
	abstract void m3();
	abstract void m4();
	
	
}
class Dfn extends Pogo{
	void m3() {
		System.out.println("this is the another method of creating obj in abstract class");
		
	}
	void m4() {
		System.out.println("then the usual method");
	}
	
	
}
public class Abstrct4 {

	public static void main(String[] args) {
		Pogo j;
		j=new Dfn();
		j.m3();
		j.m4();
   
		//----two obj creation method are used up one is correct down one is also correct--
		Dfn k=new Dfn();
		k.m3();
		k.m4();
		
		
		
	}

}
