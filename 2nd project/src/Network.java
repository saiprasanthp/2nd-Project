class An{
	int i;
	int j;
	
}
class O extends An{
	
	void m2(int b,int a) {
		i=b;
		j=a;
		System.out.println(i);
		System.out.println(j);
	}
}
class Dx extends O{
	
	void m3(int k,int g) {
		i=k;
		j=g;
		System.out.println(i);
		System.out.println(j);
		
		
	}
	
}
public class Network {

	public static void main(String[] args) {
		O m1=new O();
		m1.m2(10,20);
		Dx m=new Dx();
		m.m3(30,40);
		

	}

}
