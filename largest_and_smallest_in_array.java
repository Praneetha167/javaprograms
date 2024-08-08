package programs;

public class largest_and_smallest_in_array {

	public static void main(String[] args) 
	{
		int a[]= {8,5,9,3,7};
		int min,max,i;
		min=a[0];
		max=a[0];
		for(i=1;i<5;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
			
		}
		for(i=1;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Minimum is " +min);
		System.out.println("Maximum is " +max);
		
		// TODO Auto-generated method stub

	}

}
