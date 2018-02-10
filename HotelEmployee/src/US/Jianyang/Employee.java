package US.Jianyang;

import java.security.PrivateKey;

public abstract class Employee {
    private String name;
    private String Gender;
    private String E_number;

    public Employee() {}

    public Employee(String name, String Gender, String E_number) {
        this.name = name;
        this.E_number = E_number;
        this.Gender = Gender;
    }

    public abstract void Work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getE_number() {
        return E_number;
    }

    public void setE_number(String e_number) {
        E_number = e_number;
    }
}
