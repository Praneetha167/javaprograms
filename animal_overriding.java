package programs;
class animal{
	void move(){
		System.out.println("I am moiving");
	}
}
class cheetah extends animal{
	void move() {
		System.out.println("i am running");
	}
}
public class animal_overriding {
	

	public static void main(String[] args) {
		cheetah obj=new cheetah();
		obj.move();
		// TODO Auto-generated method stub

	}

}
