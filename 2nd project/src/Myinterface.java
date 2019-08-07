interface Jb{
	int x=20;                                          //interface class 
	public abstract void m1(int a,int b);            //abstract class public is access specifier
	
	
}
class Sf implements Jb{
	int c;
	
	int f;
	public void m1(int a,int b) {  
		c=a;                                //public is manditory--    
		f=b;
		System.out.println(c);
		System.out.println(f);
		System.out.println("we must add public compulsory here");
		
	}
	
}
public class Myinterface {

	public static void main(String[] args) {
		Sf j=new Sf();                              //object creation
		j.m1(10,20);
		System.out.println(j.x);

	}

}
