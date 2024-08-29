package programs;

public class dog {
	String name;
	String color;
	dog(String namep,String colorp){
		name=namep;
		color=colorp;
	}
	void display() {
		System.out.println(name);
		System.out.println(color);
	}

	public static void main(String[] args) {
		dog obj=new dog("scooby","white");
		obj.display();
		// TODO Auto-generated method stub

	}

}
