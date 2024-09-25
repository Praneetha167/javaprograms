package src;

import java.util.Scanner;
public class simpleinterest {
	public double find(int p, int t,double r)
	{
		return (p*t*r)/100;
	}

	public static void main(String[] args) {
		
		simpleinterest obj=new simpleinterest();
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter p:");
		int p=input.nextInt();
		
		System.out.println("enter t:");
		int t=input.nextInt();

		System.out.println("enter r:");
		double r=input.nextDouble();
		
		System.out.println("simple interest is: "+obj.find(p, t, r));

		// TODO Auto-generated method stub

	}

}
