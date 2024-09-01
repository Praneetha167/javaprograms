package src;

public class Rectangle {
	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length=length;
		
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width=width;
		
	}
	public int getWidth() {
		return width;
	}

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.setLength(40);
		obj.setWidth(20);
		System.out.println("length is:"+obj.getLength());
		System.out.println("width is:"+obj.getWidth());
		
		// TODO Auto-generated method stub

	}

}
