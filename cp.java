package src;

public class cp {
	int id;
	String name;
	public cp(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("name is: " + name + ", id is: "+ id );
	}

	public static void main(String[] args) {
		cp obj1=new cp(100,"raj");
		cp obj2=new cp(200,"karan");
		obj1.display();
		obj2.display();
		
		// TODO Auto-generated method stub

	}

}
