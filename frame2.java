package awt;
import java.awt.*;
public class frame2 {
	frame2(){
		Frame f=new Frame();
		Button b=new Button("BVRIT HYDERABAD");
		b.setBounds(90,90,90,90);
		f.add(b);
		f.setSize(400,600);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		frame2 f=new frame2();
		// TODO Auto-generated method stub

	}

}
