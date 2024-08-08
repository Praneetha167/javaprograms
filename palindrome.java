package programs;

public class palindrome {

	public static void main(String[] args) 
	{
		int n=54345;
		int temp;
		int rem,sum=0;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("it is a palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		// TODO Auto-generated method stub

	}

}
