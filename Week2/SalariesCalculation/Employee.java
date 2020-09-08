public class Employee implements Taxes{
    private double baseSalary = 40000;
    private int years;

    public Employee(int years) {
        this.years = years;
    }

    public double getBonus() {
        return years*1000;
    }
    
    public double getGrossSalary(){
        return baseSalary + this.getBonus();
    }
    
    public double getTaxRate(){
        return Taxes.getTaxRate(this.getGrossSalary());
    }
    
    public double getNetSalary(){
        return this.getGrossSalary()-(this.getGrossSalary() * getTaxRate());
    }    
}