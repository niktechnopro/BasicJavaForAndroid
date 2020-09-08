package recipes;

public class Soup extends Recipe{

	//fields
	private int cook_time;
	private float price_factor;

	//constructor
	public Soup(String name, String[] ingredients, int cook_time, float price_factor){
		this.name = name;
		this.ingredients = ingredients;
		this.price_factor = price_factor;
		this.cook_time = cook_time;
	}

	//methods
	public String getPrice(){
		return "$" + (ingredients.length - 1)*this.price_factor;
	}

	public boolean prepareRecipe(){
		System.out.println("\t> Starting preparation for: " + this.name);
		System.out.println("\t> Adding the following ingredients: ");
		for(String ingredients : this.ingredients){
			System.out.println("\t\t* " + ingredients);
		}
		System.out.println("\t> Cooking the soup in the pot for " + this.cook_time + " minutes");
		return true;
	}
}