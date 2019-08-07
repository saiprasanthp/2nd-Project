interface Mb{
	void transcation();
	void deposite(int a,int b);
	void withdrawl();
	void savingsAccount();
}
abstract class Gd implements Mb{
	public void transcation() {
		System.out.println("transcation method");
		
	}
	public void deposite(int a,int b){
		int c;
		int d;
		c=a;
		d=b;
		System.out.println(c);
		System.out.println(d);
		System.out.println("deposite method");
		
	}
}
class Fs extends Gd{
	public void withdrawl() {
		System.out.println("withdrawl method");
		
	}
	public void savingsAccount() {
		System.out.println("savingsAccount");
		
	}
	
}

public class Interfce4 {

	public static void main(String[] args) {
		Fs g=new Fs();
		g.withdrawl();
		g.savingsAccount();
		g.transcation();
		g.deposite(20,30);

	}

}
