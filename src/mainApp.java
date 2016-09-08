import java.util.Scanner;

/**
* this is a demo app to decide what to wear
* this demo uses boolean statements
 * and if/else statements to output attire 
 */

/**
 * @author Kimberli
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFancyFriday, inputSunny, inputRaining;
		boolean fancyFriday = false;
		boolean	sunny = false; 
		boolean raining = false; 
		
		String inputContinue;
		boolean userContinue = true;
		
		// get input from user
			Scanner k = new Scanner(System.in);
			
		while(userContinue){
			System.out.println("Is it fancy friday?");
			inputFancyFriday = k.nextLine();
			
			System.out.println("Is it sunny?");
			inputSunny = k.nextLine();
			
			System.out.println("Is it raining?");
			inputRaining = k.nextLine();
			
			//test if the variables are working properly
			//System.out.println(inputFancyFriday + " " + inputSunny + " " + inputRaining);
			
		
		// set condition variables based on input
			if (inputFancyFriday.equalsIgnoreCase("yes")){
				fancyFriday = true;
			}
			if (inputSunny.equalsIgnoreCase("yes")){
				sunny = true;
			}
			if (inputRaining.equalsIgnoreCase("yes")){
				raining = true;
			}
			//test if the variables are working properly
			//System.out.println(fancyFriday + " " + sunny + " " + raining);
			
			
		// use if statement to decide what to wear
			if(fancyFriday){
				if(sunny){
					System.out.println("tea gown");
				}else if(raining){
					System.out.println("power suit");
				}else {
					System.out.println("long gown");
				}
			}else {
				System.out.println("tshirt and jeans");
			}
		//ask if user wants to continue
		System.out.println("Continue?");
		inputContinue = k.nextLine();
		if(inputContinue.equals("yes")){
			userContinue = true;
			}else {
				userContinue = false;
			}
		}//closes while loop
	}

}
