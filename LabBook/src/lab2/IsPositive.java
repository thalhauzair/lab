package lab2;

public class IsPositive {

	public static void main(String[] args){
		String number = args[0];
		int num = Integer.parseInt(number);
		if(num>0) {
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
	}
}
