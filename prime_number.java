package programs;

public class prime_number {

	public static void main(String[] args)
	{
		int n=11;
		int i=0;
		int count=0;
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				count=1;
			}
		}
		if(count==0)
		{
			System.out.println("it is a prime number");
			
		}
		else
		{
			System.out.println("it is not a prime number");
		}
		// TODO Auto-generated method stub

	}

}
