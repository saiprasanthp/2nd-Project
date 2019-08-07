
public class IfElseIf2 {

	public static void main(String[] args) {
		int age=32;
		int weight=22;
		
		if(age<18 && weight<18) {
			System.out.println("not eligible for voting");
		}
		else if(age>=18 &&weight >=18 && age<30 && weight<30){
			System.out.println("he is eligible");
			System.out.println("also for weght");
		}
		else if(age>=30 && age<40) {
			System.out.println("he is purely involved in election");
		}
		else {
			System.out.println("invalid");
		}
		
 
	}

}
