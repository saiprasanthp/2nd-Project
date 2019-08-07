class Dg{
	int a;
	int b;
	Dg(int x,int y){
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
		
	}
	
}
class Hk extends Dg{
	Hk(int j,int l){
		super(10,20);
		a=j;
		b=l;
		System.out.println(a);
		System.out.println(b);
	}
	
	
}
public class supr {

	public static void main(String[] args) {
		Hk h=new Hk(1,2);

	}

}
