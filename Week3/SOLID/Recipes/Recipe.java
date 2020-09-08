package recipes;

public abstract class Recipe{

	//fields
	protected String name;
	protected String[] ingredients;

	//non abstruct methods
	public String getName(){
		return this.name;
	}

	public String printFormat(){
		return this.name + " - Price " + this.getPrice();
	}

	public String[] RecipeIngredients(){
		return this.ingredients;
	}

	//abstruct methods
	public abstract String getPrice();
	public abstract boolean prepareRecipe();
}