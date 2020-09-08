package recipes;

public class Drink extends Recipe{

	//fields
	private int bake_time;
	private float price_factor;

	public Drink(String name, String[] ingredients, int bake_time, float price_factor){
		this.name = name;
		this.ingredients = ingredients;
		this.price_factor = price_factor;
	}

	public String getPrice(){
		return "$" + (ingredients.length - 1)*this.price_factor;
	}

	public boolean prepareRecipe(){
		System.out.println("\t> Starting preparation for: " + this.name);
		System.out.println("\t> Adding the folowing ingredients: ");
		for(String ingredients : this.ingredients){
			System.out.println("\t\t* " + ingredients);
		}
		return true;
	}
}