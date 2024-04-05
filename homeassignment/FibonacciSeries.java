package week1.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 8;
		int num1 =0;
		int num2=1;
		int num3=0;
		for(int i=0;i<number;i++)
		{
		
			System.out.println(num1);
			num3 = num1+num2;
			num1=num2;
			num2=num3;
		}
		
	}

}
