public class Car{
	public int topSpeed;
	public int seatingCapactiy;

	public Car(int topSpeed, int seatingCapactiy){
		this.topSpeed = topSpeed;
		this.seatingCapactiy = seatingCapactiy;
	}

	public int getTopSpeed(){
		return topSpeed;
	}
	
	public int getSeatingCapacity(){
        return seatingCapactiy;
    }

	public void printDescription(){
		System.out.println("Car");
	}
}