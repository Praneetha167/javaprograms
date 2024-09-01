package src;

class Computer {
	class Processor{
		String brand;
		int speed;
		public Processor(String b,int s) {
			brand=b;
			speed=s;
			
		}
		void displaydetails() {
			System.out.println("brand is:"+brand);
			System.out.println("speed is:"+speed);
		}
	}

	public static void main(String[] args) {
		Computer comp=new Computer();
		Computer.Processor pro=comp.new Processor("Apple",500);
		pro.displaydetails();
		// TODO Auto-generated method stub

	}

}
