//we do not need to import anything - because everything is in the same folder


public class Main {
	public static void main(String[] args){
		Car taxi = new Car(4);
		System.out.println("Taxi has wheels? " + taxi.hasWheels() + " Number of wheels: " + taxi.numberOfWheels());
	}
}