package exceptionHandling.com;

public class ExceptionalHandling extends RuntimeException {

	public static void main(String[] args) {
		try {
			System.out.println("sai");
			System.out.println(100/0);
			System.out.println("manu");
		}catch(Exception e) {
			throw new ExceptionalHandling();
		}
		finally {
			System.out.println("k");
		}
	}
}
