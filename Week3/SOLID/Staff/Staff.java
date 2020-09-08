package staff;

public class Staff{

	//fields
	protected String name;
	protected int staff_id;
	protected float salary;

	//constructor
	public Staff(String name, int id){
		this.name = name;
		this.staff_id = id;
	}

	//non abstract methods
	public String getName(){
		return this.name;
	}

	public int getID(){
		return this.staff_id;
	}
}