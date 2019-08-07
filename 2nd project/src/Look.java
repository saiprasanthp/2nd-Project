class D{
	int a;
}
class J extends D{
	int a;
	void display(int x,int y) {
		super.a=x;
		a=y;
		System.out.println(super.a);
		System.out.println(a);
		
		
	}
	
}
public class Look {

	public static void main(String[] args) {
		
J d=new J();
d.display(2,20);


	}

}
