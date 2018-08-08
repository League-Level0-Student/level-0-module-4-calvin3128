package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnStory {
public static void main(String[] args) {
	
	String where = JOptionPane.showInputDialog(null, "Would you like to travel to the landfill or Costa Rica?");
	
	if(where.equalsIgnoreCase("landfill")) {
	landfill();
	}
	else if(where.equalsIgnoreCase("costa rica")) {
	costa();
	}
	
	
	
	
	
	
	
	
}

static void landfill() {
	String home = JOptionPane.showInputDialog("do you want to go home");
	if(home.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "goodbye");
	}
	else {
		JOptionPane.showMessageDialog(null, "don't lie to me. go home");
	}
}

static void costa() {
	String home = JOptionPane.showInputDialog("are you ready to leave?");
	if(home.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "goodbye");
	}
	else {
		JOptionPane.showMessageDialog(null, "sorry, but vacation is over. go home");
	}
}

}
