abstract interface Lk{

	void m1();
	abstract void m2(int a,int b,int rollno,String name,double d);
}
class Kl implements Lk{
	int c;
	int g;
	int rollno;
	String name;
	double d;
	public void m1() {
		System.out.println("hello");
		
	}
	public void m2(int a,int b,int rollno,String name,double d) {
		
		
		c=a;
		g=b;
		this.rollno=rollno;
		this.name=name;
		this.d=d;
		System.out.println(c);
		System.out.println(g);
		System.out.println(this.rollno);
		System.out.println(this.name);
		System.out.println(this.d);
		
	}
}
interface Jk {
	public static void main(String args[]) {
		Kl t=new Kl();
		t.m1();
		t.m2(20,30,101,"sai",40000);
		
	}
}
