package recipes;

public class Pizza extends Recipe{

	//fields
	private int bake_time;
	private float price_factor;

	//constructor
	public Pizza(String name, String[] ingredients, int bake_time, float price_factor){
		this.name = name;
		this.ingredients = ingredients;
		this.price_factor = price_factor;
		this.bake_time = bake_time;
	}

	public String getPrice(){
		return "$" + (ingredients.length - 1)*this.price_factor;
	}

	public boolean prepareRecipe(){
		System.out.println("\t> Starting preparation for: " + this.name);
		System.out.println("\t> Adding the following ingredients: ");
		for (String ingerients : this.ingerients){
			System.out.println("\t\t* " + ingredients);
		}
		System.out.println("\t> Cooking in the oven for " + this.bake_time + " minutes");
		return true;
	}
}