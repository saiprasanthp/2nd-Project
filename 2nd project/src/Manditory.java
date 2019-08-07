class Gf{
	int a;
	int b;
	Gf(int x,int y){
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
		System.out.println("hello");
	}
	
}
class Dlf extends Gf{
	Dlf(int x,int y){
		super(20,30);
		System.out.println("hello1");
		
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}
public class Manditory {

	public static void main(String[] args) {
		Dlf j=new Dlf(30,20);
		 
		

	}

}
