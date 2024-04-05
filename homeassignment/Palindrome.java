package week1.homeassignment;

public class Palindrome {
	static int i=0;

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int input = 12345;
		int temp=0;
		int reverse = 0;
		for(int i=input; i>0; i=i/10)
		{
			
			temp = i%10;
			System.out.println(temp);
			reverse = (temp+reverse)*10;
		}
		reverse = reverse/10;
		System.out.println(reverse);
		
		if(input == reverse)
		{
			System.out.println("The given number is Palindrome");
		}
		else
		{
			System.out.println("The given number is not Palindrome");
		}
	}
	
}
