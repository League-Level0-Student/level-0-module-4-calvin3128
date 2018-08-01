package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sscore = JOptionPane.showInputDialog("What score did you get on your thermonuclear properties test?");
		double nscore = Double.parseDouble(sscore);
		if(nscore > 3) {
			JOptionPane.showMessageDialog(null, "i guess thats pretty good");
		}
		else {
			JOptionPane.showMessageDialog(null, "oh");
		}
	}

}
