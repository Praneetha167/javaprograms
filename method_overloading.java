package programs;

public class method_overloading {
	public int mul(int x) {
		return x;
	}
	public int mul(int x,int y) {
		return(x*y);
	}
	public double mul(double x ,double y) {
		return(x*y);
	}

	public static void main(String[] args) {
		method_overloading obj=new method_overloading();
		System.out.println("answer is: " +obj.mul(4));
		System.out.println("product is: " +obj.mul(2,8));
		System.out.println("product is: " +obj.mul(2,3));
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
