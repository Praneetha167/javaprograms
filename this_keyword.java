package programs;

public class this_keyword {
	void age() {
		this.name();
		System.out.println("My age is 19 years");
	}
	void name() {
		System.out.println("I am Praneetha");
	}

	public static void main(String[] args) {
		this_keyword obj=new this_keyword();
		obj.age();
		// TODO Auto-generated method stub

	}

}
