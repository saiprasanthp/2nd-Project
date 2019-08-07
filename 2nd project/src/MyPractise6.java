interface MyInter{
	void m1();                  //--basically interface contain abstract method so abstract public void 
	
}
interface Itk extends MyInter{
	void m2();
	
	
}
interface Lkj extends Itk{
	void m3();
	
}
class Demo implements Lkj{
	public void m1() {                 //so we use public infront of method
	System.out.println("in interface we use public infront of method");	
	}
	public void m2() {
		System.out.println("m2 method");
		
	}
	public void m3() {
		System.out.println("m3 method");
		
	}
	
	
}
public class MyPractise6 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		d.m2();
		d.m3();

	}

}
