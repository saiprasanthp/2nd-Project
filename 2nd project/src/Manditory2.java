class Ki{
	int a;
	int b;
	Ki(int a){
		this.a=a;
		System.out.println(this.a);
		
	}
	
}
class Hi extends Ki{
	
	
	Hi(){
		super(10);
		b=20;
		System.out.println(b);
		
		
		
		
		
		
	}
	
}
public class Manditory2 {

	public static void main(String[] args) {
		Hi b=new Hi();

	}

}
