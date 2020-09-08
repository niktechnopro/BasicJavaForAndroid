public class CityCar extends Car{
    
    public CityCar(int topSpeed, int seatingCapacity) {
	    super(topSpeed, seatingCapacity);
    }
    
    public void printDescription() {
	    System.out.println("City Car");
    }
    
}