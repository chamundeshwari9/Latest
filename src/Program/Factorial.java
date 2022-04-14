package Program;

public class Factorial {

	public static void isFactorial(int num)
	{
		int fact =1;
		for (int i = 1; i <=num; i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
	public static int fact(int num)
	{
		
		if (num == 0) {
			return 1;
			
		}
		else  {
		
		return (num*fact(num-1));
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isFactorial(9);
		System.out.println(fact(9));

	}

}
