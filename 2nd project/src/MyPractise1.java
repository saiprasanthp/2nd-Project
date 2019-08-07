class Test2{
	int a;
	int b;
	String sname;
	double k;
	Test2(int g,String name,double h){
		a=g;
		sname=name;
		k=h;
		System.out.println(a+name+k);
		
		System.out.println("hello");
	}
	void m1(int c,int d) {
		a=c;
		b=d;
		System.out.println(a);
		System.out.println(b);
		
	}
	void m2(int e,int f) {
		a=e;
		b=f;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}
public class MyPractise1 {

	public static void main(String[] args) {
		Test2 g=new Test2(101,"string",5000f);
		g.m1(20,30);
		g.m2(40,50);
		

	}

}
