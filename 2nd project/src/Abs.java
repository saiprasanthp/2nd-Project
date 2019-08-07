abstract class N{

	abstract void display();
	void sai() {
		System.out.println("this is concrete class");
	}
	
	
}
class V extends N{
	void display() {
		System.out.println("this is abstract method overridding");
	}
	
}
public class Abs {

	public static void main(String[] args) {
		V b=new V();
		b.display();
b.sai();
	}

}
