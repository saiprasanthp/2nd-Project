class Vn{
	int a;
	int b;
	void gain(int x,int y) {
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
		System.out.println("hello1");
	}
	
}
class Mv extends Vn{
	void display(int h,int j) {
		a=h;
		b=j;
		System.out.println(a);
		System.out.println(b);
		super.gain(10,20);
		System.out.println("hello");
	}
	
}
public class Met {

	public static void main(String[] args) {
Mv b=new Mv();
b.display(2,3);

	}

}
