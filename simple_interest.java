package src;
import java.util.Scanner;

public class simple_interest {

		public  int calculate(int p, int t, int r){
			return (p*t*r)/100;
		}
		public static void main(String[] args) {
			
			System.out.println("Enter principal");
			Scanner obj =new Scanner(System.in);
			int p=obj.nextInt();
			System.out.println("Enter time");
			Scanner obj1 =new Scanner(System.in);
			int t=obj1.nextInt();
			System.out.println("Enter rate");
			Scanner obj2 =new Scanner(System.in);
			int r=obj2.nextInt();
			simple_interest obj3=new simple_interest();
			System.out.println("simple interest is:"+ obj3.calculate(p,t,r));
		
			
			
			
		}
		// TODO Auto-generated method stub

	}


