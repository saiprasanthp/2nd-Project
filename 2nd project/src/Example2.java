class Ja{
	int a;
}
class k extends Ja{
	int b;
	void  net(int i,int j){
		
		a=i;
		b=j;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}
public class Example2 {

	public static void main(String[] args) {
k v=new k();
v.net(2,3);
	}

}
