package US.Jianyang;

public class Chef extends Employee implements VIP{
    public Chef() {
    }

    public Chef(String name, String Gender, String E_number) {
        super(name, Gender, E_number);
    }

    public void Work() {
        System.out.println(getName() + " Cooking food.");
    }

    public void Services() {
        System.out.println(getName() + " Give VIP Customers more food.");
    }
}
