package awtjava;
import java.awt.*;
import java.awt.event.*;

public class openframe extends Frame implements ActionListener{
	Button b1=new Button("Next");
	Button b2=new Button("Submit");
	openframe(){
	b1.setBounds(100,100,70,40);
	b2.setBounds(200,100,70,40);
	add(b1);
	add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
    }
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Frame f2=new Frame();
			f2.setSize(400,400);
			f2.setVisible(true);
			f2.setTitle("Second Frame");
			Button b3=new Button("Empty button");
			f2.add(b3);
			b3.setBounds(200,100,70,40);
			b2.setBackground(Color.ORANGE);
		}
		else
		{
			System.exit(0);

			
		}
	}

	public static void main(String[] args) {
		openframe f1=new openframe();
		f1.setSize(500,500);
		f1.setTitle("First Frame");
		f1.setVisible(true);
		
		

	}
}

