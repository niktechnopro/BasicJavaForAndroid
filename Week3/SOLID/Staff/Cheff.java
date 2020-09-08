package staff;
import Recipes.*;


public class Cheff extends Staff implements Cook{


	//constructor
	public Cheff(String name, int id){
		super(name, id);
	}

	public void cleanWorkSpace(){
		System.out.println("\n>Cheff "+ this.name + " is cleaning his workspace...");
	}

	public void cook(Recipe recipe){
		this.cleanWorkSpace();
		this.cleanHands();
		recipe.prepareRecipe();
	}

	public void cleanHands(){
		System.out.println("\n>Cheff " + this.name + " is cleaning his hands... to cook!");
	}
}