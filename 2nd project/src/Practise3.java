abstract class Jkl{                         //------abstract class---
	abstract void m1(int a,int b);          //------abstract method---
	abstract void m2(int a,int b);          //-------abstract method----
}
class Di extends Jkl{
	int g;
	int k;
	void m1(int a,int b) {                  
	
		g=a;
		k=b;
		System.out.println(g);
		System.out.println(k);	
	}
	void m2(int a,int b) {
		g=a;
		k=b;
		System.out.println(g);
		System.out.println(k);
		
	}
	
}
public class Practise3 {

	public static void main(String[] args) {
		Di h=new Di();                          //----creating object----
		h.m1(10,20);                            //-----method creation1--
		h.m2(40,50);                            //----method creation 2----
		
		

	}

}
