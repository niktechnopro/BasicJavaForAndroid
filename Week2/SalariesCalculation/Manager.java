public class Manager extends Employee {
    
    private int years;
    
    public Manager (int years){
        super(years);
        this.years = years;
    }
    
    public double getBonus() {
        return years*1000 + 10000;
    }   
}