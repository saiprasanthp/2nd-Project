class Constructor{
	String name;
	int x;
	int b;
	Constructor(String name){
		this.name=name;
		
		
	}
	void display() {
		System.out.println(this.name);
	}
	Constructor(int x,String name){
		this.x=x;
		this.name=name;
		
		
	}
	void display2() {
		System.out.println(this.x+this.name);
		
	}
	Constructor(int x,String name,int b){
		this.x=x;
		this.name=name;
		this.b=b;
	

		System.out.println(this.x+this.name+this.b);

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
public class Example1 {

	public static void main(String[] args) {
		Constructor c1=new Constructor("vessels washing");
		c1.display();
		Constructor c2=new Constructor(101,"rice washing");
		c2.display2();
	Constructor c3=new Constructor(103,"cooking done",104);
	


		

	}

}
