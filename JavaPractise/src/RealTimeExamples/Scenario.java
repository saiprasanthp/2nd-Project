package RealTimeExamples;


public class Scenario {

	public static void main(String[] args) {
		LoginDemo j=new LoginDemo();
		String[] details_pro = null;
		try {
	 details_pro=j.Details_Properties();
		}catch(Exception e) {
			e.printStackTrace();
		}
		j.userDetails(details_pro);
		

	}

}
