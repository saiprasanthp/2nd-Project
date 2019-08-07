package exceptionHandling.com;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		try {
			String str="a";
			str=str+"b";
			System.out.println(str);
			try {
				System.out.println(100/0);
			}catch(Exception e) {
				System.out.println("inner catch");
			}
		}catch(Exception e) {
			System.out.println("first");
		}
		System.out.println("normal");

	}

}
