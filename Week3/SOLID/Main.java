import Menu.*;
import Recipes.*;
import Staff.*;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		System.out.println("Hello World");
		//scanner for input
		Scanner scan = new Scanner(System.in);

		//create a Retaurant
		Restaurant SOLID_Restaurant = new Restaurant();

		//displaying the menu
		SOLID_Restaurant.displayMenu();

		//message for user
		System.out.print("\n Select an Option: ");

		//user input
		int option = scan.nextInt();

		// give the user input
		SOLID_Restaurant.getMenuOption(option);
	}
}