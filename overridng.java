package programs;
class person {
	public void display() {
		
	
	System.out.println("this is a person class");
	}
}





class singer extends person{
	public void display() {
	System.out.println("This is a singer class");
}
}
public class overridng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singer obj=new singer();
		obj.display();

	}

}
