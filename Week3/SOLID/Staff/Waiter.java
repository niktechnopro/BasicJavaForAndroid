package staff;
import Recipes.*;
import Menu.*;

public class Waiter extends Staff implements ServiceStaff{

	public int menu_option;

	public Waiter(String name, int id){
		super(name, id);
	}

	//methods
	public void takeOrder(int index){
		this.menu_option = index;
		System.out.println("\n+ " + this.name + " is getting the menu option: " + index);
	}

	public Recipe giveOrder(Menu menu){
		Recipe recipe = menu.getRecipe(this.menu_option);
		System.out.println("\n+" + this.name + " is giving the " + recipe.getName() + " order to the chef!");
	}

	public void deliverOrder(){
		System.out.println("\n+" + this.name + " is delivering the order to the client...");
	}
}