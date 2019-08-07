class Gj{
	int a;
	Gj(){
		System.out.println("hello");
	}
	
}class Jl extends Gj{
	
	int b;
	Jl(int i,int j){
		a=i;
		b=j;
		System.out.println(a);
		System.out.println(b);
		System.out.println("hello2");
		
	}
	
}
public class Optional {

	public static void main(String[] args) {
Jl v=new Jl(2,3);

	}

}
