package src;


class hap {
	public int getarea()
	{
		return 0;
	}
}

class rect extends hap
{

	int length;
	int width;
	
	public rect(int l,int w)
	{
		length=l;
		width=w;
	}
	
	public int getarea()
	{
		return length*width;
	}
}
public class shap{	
	public static void main(String[] args) {
		rect obj=new rect(20,3);
		System.out.println(obj.getarea());
	}
		// TODO Auto-generated method stub

	

}
