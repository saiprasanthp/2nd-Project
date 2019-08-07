package exceptionHandling.com;

import java.io.IOException;

class H extends Throwable{

}
class Ex extends Exception{

}
public class Except {

	public void m1()  throws H,Ex {
		int i=10;
		int j=20;
		if(i==j) {
			System.out.println("ji");
			throw new H();
		}else {
			//try {
				throw new Ex();
			//}catch(Exception e) {
				//System.out.println("l");
			//}
		}
		//System.out.println("after runtime Exception");
	}
	public void m2() {
		System.out.println("m2 metjod");
	}

	public static void main(String[] args) throws InterruptedException, H, Ex {
		Except j=new Except();
		j.m1() ;
		j.m2();
	}
}
