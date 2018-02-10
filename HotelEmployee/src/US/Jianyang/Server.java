package US.Jianyang;

public class Server extends Employee implements VIP {

    public Server(String name, String Gender, String E_number) {
        super(name, Gender, E_number);
    }

    public void Work() {
        if(getGender() == "M") {
            System.out.println(getName() + " serve customer.");
        }
        else {
            System.out.println("Lady " + getName() + " serve customer.");
            Services();
        }
    }

    public void Services() {
        System.out.println(getName() + " give VIP services");
    }
}
