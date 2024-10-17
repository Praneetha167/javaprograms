package awtjava;
import java.awt.*;

public class buttons {
	buttons(){
		Frame f=new Frame("my frame with buttons");
		Button b =new Button("Click here");
		b.setBounds(50,50,50,50);
		f.add(b);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buttons obj=new buttons();
	}

}
