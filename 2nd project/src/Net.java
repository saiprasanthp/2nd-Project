class Love{
	int a;
	String name;
	Float g;
	
}class Hate extends Love{
	Hate(int a,String name,Float g){
		super.a=a;
		super.name=name;
		super.g=g;
		System.out.println(super.a+super.name+super.g);
		
	}
	void display(int a) {
		super.a=a;
		System.out.println(super.a);
	}
	
}
public class Net {                //-----------main class------------- 

	public static void main(String[] args) {
Hate c=new Hate(101,"sai",2000f);
c.display(20);
	}

}
