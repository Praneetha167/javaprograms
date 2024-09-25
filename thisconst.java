package src;

public class thisconst {
	String name;
	int age;
	public thisconst(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Name is: " +name+ ", age is: " +age);
	}

	public static void main(String[] args) {
		thisconst obj1=new thisconst("vijay",23);
		thisconst obj2=new thisconst("Karan",26);
		obj1.display();
		obj2.display();
		// TODO Auto-generated method stub

	}

}
