package assignment_6_midPointCircle;

import javax.swing.JFrame;

public class MidPointGui_2 {

	MidPointCircle b;
	JFrame jfrm;
	

	


	public MidPointGui_2(int x1, int y1, int x2) {
		// TODO Auto-generated constructor stub
		jfrm = new JFrame();
		jfrm.setSize(1000,1000);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b = new MidPointCircle(x1, y1, x2);
		jfrm.add(b);
		
		jfrm.setVisible(true);
	}
}
