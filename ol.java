package src;
import java.util.Scanner;
public class ol {
	public int add(int x,int y)
	{
		return(x+y);
		
	}
	public int add(int x)
	{
		return x;
		
	}
	public double add(double x,double y)
	{
		return x+y;
		
	}

	public static void main(String[] args) {
		ol obj1=new ol();
		Scanner input=new Scanner(System.in);
		System.out.println("enter 1");
		int one=input.nextInt();
		System.out.println(obj1.add(one));
		System.out.println("enter 2");
		int two1=input.nextInt();
		int two2=input.nextInt();
		System.out.println(obj1.add(two1,two2));
		
		
		
		// TODO Auto-generated method stub

	}

}
