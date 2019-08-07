package interfaceDemo.com;

public abstract class Input implements Jeep{
	public void m1() {
		int a=10;
		this.m2(a);
		System.out.println("ll");
	}
	/*public void m2(int i) {
		System.out.println(i);
		System.out.println("mm");
		System.out.println(a);
	}*/
	public abstract void m2(int i);
}
class N extends Input{
	public void m2(int i) {
		System.out.println(i);
	}
}

