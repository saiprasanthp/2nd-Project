class Dv{
	int a;
	int b;
	void sai(int x) {
		a=x;
		System.out.println(a);
	}
	void manu (int y,int h) {
		a=y;
		b=h;
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class Ventor {

	public static void main(String[] args) {
		Dv b=new Dv();
		b.sai(10);
		b.manu(20,30);

	}

}
