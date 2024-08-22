package programs;
class college{
	String name="BVRITH";
}
class classroom extends college{
	String section="CSE-C";
}

public class inheritance {
	

	public static void main(String[] args) {
		classroom obj=new classroom();
		System.out.println("College name is: " +obj.name+"\nClassroom is: "+obj.section);
		// TODO Auto-generated method stub

	}

}
