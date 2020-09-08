import Menu.*;
import Recipes.*;
import Staff.*;
import java.util.Scanner;

public class Restaurant{

	//fields
	private MenuManager menu_manager;
	private Cheff cheff;
	private Waiter waiter;

	//constructor
	public Restaurant(){
		this.menu_manager = new MenuManager();
		this.waiter = new Waiter("James", 1);
		this.cheff = new Cheff("Carl", 0);
	}

	public void displayMenu(){
		this.menu_manager.displayMenu();
	}

	public void getMenuOption(int option){
		this.waiter.takeOrder(option);
		this.cheff.cook(this.waiter.giveOrder(this.menu.menu_manager.getMenu()));
		this.waiter.deliverOrder();
		System.out.println("\n\n ----- Order Finish -----");
	}
}