package Menu;
import Recipes.*;
import java.util.LinkedList;

public class Menu{

	//fields
	private LinkedList<Recipe> menu_options;

	//constructor
	public Menu(){
		this.menu_options = new LinkedList<Recipe>();
	}

	public boolean addRecipe(Recipe recipe){
		this.menu_options.add(recipe);
		return true;
	}

	public Recipe getRecipe(int index_recipe){
		if(index_recipe > 0 && index_recipe <= (menu_options.size())){
			return menu_options.get((index_recipe -1));
		}else{
			System.out.println(" Not a valid options!");
			return null;
		}
	}

	public String toString(){
		String menu = "\n";
		for (int i=0; i<menu_options.size(); i++){
			menu = menu + "("+(i+1)+")\t" + menu_options.get(i).printFormat() + "\n";
		}
		return menu;
	}
}
