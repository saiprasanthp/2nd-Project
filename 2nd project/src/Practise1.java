class Hello{
	int a;
	void m2(int a) {
		System.out.println("hello1");
		this.a=a;
		System.out.println(this.a);
		
		
		
	}
	
	
	
}
class Dell extends Hello{
	int b;
	void m1(int a,int b) {
		super.m2(10);
		this.b=b;
		System.out.println(this.b);
		
		
		
	}
	
	
}
public class Practise1 {

	public static void main(String[] args) {
		Dell d=new Dell();
		d.m1(10,20);

	}

}
