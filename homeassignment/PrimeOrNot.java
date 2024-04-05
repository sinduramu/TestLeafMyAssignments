package week1.homeassignment;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 17;
		int count = 0;
		
		for(int i=2;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		
		
		if(count==1)
		{
			System.out.println("The given number is prime "+number);
		}
		else
		{
			System.out.println("The given number is not prime "+number);
		}

	}

}
