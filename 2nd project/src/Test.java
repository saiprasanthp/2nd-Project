public class Test{
	int a;
	int b;
	int c;
	Test(){
		System.out.println("default constructor");
		a=1;
		b=2;
		System.out.println(a);
		System.out.println(b);
		System.out.println("values are created");
	}
	Test(int x,int y){
		System.out.println("parameterised constructor");
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
		System.out.println("values of parametersied");
	}
	void display(int x) {
		a=x;
		
		System.out.println(a);
	}
	
	Test(int i){
		System.out.println("2parameterised constructor");
		a=i;
		System.out.println(a);
		
	}
	Test(int h,int l,int g){
		a=h;
		b=l;
		c=g;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	


	
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test(10,20);
		t2.display(90);
		Test t3=new Test(20);
		Test t4=new Test(20,30,40);

	}

}
