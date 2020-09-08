package Menu;
import Recipes.*;


public class MenuManager{

	//fields
	private Menu menu;


	//methods
	public MenuManager(){
		this.menu = new Menu();
		this.fillMenu();
	}


	public void fillMenu(){
		this.menu.addRecipe(new Pizza("Pizza Margherita", new String[]{"San Marzano Tomatoes", "Basil", "Salt", "Extra-Virgin Oil"}, 20, 1.20f ));
		this.menu.addRecipe(new Drink("Sake Spritzer", new String[]{"1 Basil", "6 Mit Leaves", "2 Lemon Twists", "1 Orange Wedge", "1/4 Cup  cucumber", "Ice"}, 10, 1.50f ));
		this.menu.addRecipe(new Soup("Ribollita", new String[]("600g Root Vegetables, peeled, chopped", "2 Tomatoes, Peeled, Coarsely Chopped", "2 Garlic Gloves, Crushed", "2 Fresh Herb Springs", 30, 2.50f)));
	}

	public Menu getMenu(){
		return this.menu;
	}

	public void displayMenu(){
		System.out.println(this.menu);
	}
}
