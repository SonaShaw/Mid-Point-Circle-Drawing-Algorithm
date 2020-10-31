package assignment_6_midPointCircle;

import javax.swing.SwingUtilities;

import assignment_5_brasenham_circle.Gui_2;

public class Main {

	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MidPointGui_1 gui = new MidPointGui_1();
			}
		});
	}
}
