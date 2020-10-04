package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel =  0; 
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("what kind of pet would like to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How are you gonna take car your pet", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Walk it every day", "Feed it food", "play with your pet" }, null);

			System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				walkPet();
			}
			if(task == 1 ) {
				feedPet();
			}
			
			if(task == 2) {
				playwithpet();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	private static void playwithpet() {
		// TODO Auto-generated method stub
		
	}

	private static void feedPet() {
		// TODO Auto-generated method stub
		
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void walkPet() {
		JOptionPane.showMessageDialog(null, "Thank you for walking me!");
		happinessLevel += 10;
	}
}