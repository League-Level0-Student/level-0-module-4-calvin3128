package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
double money = 0.00;
		// Ask the user how many nickels they have
String nstring = JOptionPane.showInputDialog("How many nickels do you have?");
		
int nnum = Integer.parseInt(nstring);
		// Ask the user how many dimes they have, and convert their answer
String dstring = JOptionPane.showInputDialog("How many dimes do you have?");

int dnum = Integer.parseInt(dstring);
		// Ask the user how many quarters they have, and convert their answer
String qstring = JOptionPane.showInputDialog("How many quarters do you have?");

int qnum = Integer.parseInt(qstring);
		// Calculate how much money the user has and save it in a double variable 
money = 0.05*nnum + 0.1*dnum + 0.25*qnum;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "Dang you have the phat stacks! $" + money + " is a lot of money!");
	}
}

