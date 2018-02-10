package US.Jianyang;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(String name, String Gender, String E_number, double Wage) {
        super(name, Gender, E_number);
        this.Wage = Wage;
    }

    public void Work () {
        System.out.println(getName() + " Manager control the hotel. his Monthly wage is " + getWage());
    }

    private double Wage;

    public double getWage() {
        return Wage;
    }

    public void setWage(double wage) {
        Wage = wage;
    }
}
