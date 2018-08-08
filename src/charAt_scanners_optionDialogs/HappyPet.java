package charAt_scanners_optionDialogs;
import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("what pet do you want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
for (int i = 0; i < 20; i++) {
	if(happinessLevel > 15) {
		break;
	}

			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to take care of your pet?", "Pet Care", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Walk", "Give Water" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	feed();
}
else if(task == 1) {
	walk();
}
else if(task == 2) {
	water();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void feed() {
		System.out.println("thank, yum");
		happinessLevel = happinessLevel + 3;
	}
	
	static void walk() {
		System.out.println("*walks*");
		happinessLevel = happinessLevel + 2;
	}
	
	static void water() {
		System.out.println("sluurp");
		happinessLevel = happinessLevel + 1;
	}
	
	
}