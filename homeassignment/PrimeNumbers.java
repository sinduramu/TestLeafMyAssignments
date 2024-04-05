package week1.homeassignment;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 50;
		int count = 0;
		
		for(int i=2;i<=number;i++)
		{
			for(int j=2;j<=number;j++)
			{
				if(i%j==0)
				{
					count++;
				}
					
			}
			
			if(count==1)
			{
				System.out.println(i);
				
			}
			count=0;
			}
		}
		

}
