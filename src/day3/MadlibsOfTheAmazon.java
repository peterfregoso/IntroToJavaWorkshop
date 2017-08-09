package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		String adjective = JOptionPane.showInputDialog("give me an adjective");
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		String liquid = JOptionPane.showInputDialog("give me an liquid");
		// Get the user to enter an adjective
		String bodypart = JOptionPane.showInputDialog("give me an body part");
		// Get the user to enter a type of liquid
		String verb = JOptionPane.showInputDialog("give me an verb");
		// Get the user to enter a body part
		String place = JOptionPane.showInputDialog("give me a place");
		// Get the user to enter a verb
		String madlibs = "Piranhas are more " + adjective +
				" during the day, so cross the river at  night. Piranhas are attracted to fresh "
				+ liquid + " and will most likely take a bite out of your " + bodypart + " if you "
				+ verb +  ". Whatever you do, if you have an open wound, try to find another "
						+ " way to get back to the " + place + ". good luck ";
		JOptionPane.showMessageDialog(null, madlibs);
				// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

