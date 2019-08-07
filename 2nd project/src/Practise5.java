class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
}
class Student extends Person{
	
	Student( String name2,int rollno){
		super("sai",23);
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(rollno);
		System.out.println(name2);
		
	}
	
	
}
public class Practise5 {

	public static void main(String[] args) {
		Student a=new Student("sai",101);
		

	}

}
