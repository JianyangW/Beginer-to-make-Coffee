package US.Jianyang;

public class Main {

    public static void main(String[] args) {
	Manager a = new Manager("a", "b", "c", 7000.0);
	a.setName("Mark");
	a.setE_number("M01");
	a.setGender("M");
	a.setWage(9000.00);
	a.Work();

	Employee b = new Server("Adam", "M", "S01");
	b.Work();
	Server c = new Server("Lucy", "F", "S02");
	c.Work();

	Chef d = new Chef("Sam", "M", "C01");
	d.Services();
	d.Work();
    }
}
