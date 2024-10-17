package awtjava;
import java.awt.*;
import java.awt.event.*;

public class buttondeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("Button Example");
		Button b=new Button("Goto BVRITH");
		b.setBounds(100,100,80,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		System.exit(0);
		}
		});
	}

}
