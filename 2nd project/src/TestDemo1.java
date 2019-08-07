class Test1{
	int a;
	int b;
	Test1(){
		this(10);
		
		System.out.println("hello");
		a=1;
		b=2;
		System.out.println(a);
		System.out.println(b);
	}
	Test1(int x){
		this(100,200);
		System.out.println("hello1");
		a=x;
		System.out.println(a);
		
	}
	Test1(int x,int y){
		System.out.println("hello2");
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
		
	}
}
public class TestDemo1 {

	public static void main(String[] args) {
		Test1 ob=new Test1();

	}

}
