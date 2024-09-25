package src;

abstract class animal {
	abstract void sound();
}

class lion extends animal{
	void sound(){
		System.out.println("Lion is roaring");
		
	}
}

class tiger extends animal{
	void sound() {
		System.out.println("Tiger is roaring");
	}
}

public class abanimal{
	public static void main(String[] args) {
		lion obj=new lion();
		tiger obj1=new tiger();
		obj.sound();
		obj1.sound();
	}
}
		// TODO Auto-generated method stub

