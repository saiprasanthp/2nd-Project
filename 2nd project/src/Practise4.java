class Ch{
	Ch(){
		System.out.println("chiranjeevi");
	}
	
}
class Bk extends Ch{
	Bk(){
		System.out.println("balakrishna");
	}

		
	}
class Nag extends Bk{
	Nag(){
		System.out.println("nagarjuna");
	}
	
}
class Ven extends Nag{
	Ven(){
		System.out.println("venkatesh");
	}
	
}
public class Practise4 {

	public static void main(String[] args) {
		Ven h=new Ven();

	}

}
