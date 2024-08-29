package programs;
class shape {
	int getarea(int a, int b) {
		return (a+b*b);
	}
}
class rectangle extends shape { 
     int getarea(int a, int b){
    	return(a*b);
    }
	
}

public class rectangleshape {

	public static void main(String[] args) {
		rectangle obj=new rectangle();
		System.out.println(obj.getarea(2,5));
		// TODO Auto-generated method stub

	}

}
