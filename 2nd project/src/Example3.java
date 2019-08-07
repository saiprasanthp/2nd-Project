class Bg{
	Bg(){
		
		System.out.println("hello");
	}
	Bg(int x){
		
		this(100,300);
		System.out.println("hello2");
	}
	Bg(int x,int y){
	
		System.out.println("hello2");
	}
	void display() {
		System.out.println("this is my example");
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		Bg n=new Bg();
		n.display();
		
		
		
		

	}

}
