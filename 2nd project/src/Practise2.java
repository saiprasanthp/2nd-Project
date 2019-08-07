class Op{
	int a;
	int b;
	void nw() {
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}
class Gp extends Op{
	void solid(int a) {
		super.nw();
		this.a=a;
		System.out.println(this.a);
		
	}
	
}
public class Practise2 {

	public static void main(String[] args) {
		Gp n=new Gp();
		n.solid(30);

	}

}
