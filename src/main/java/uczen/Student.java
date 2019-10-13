package uczen;

import lombok.Getter;

@Getter
public class Student {

    protected String name;
    protected String surname;
    protected String pesel;

    public Student() {
    }

    public Student(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        //this.pesel = pesel;
        setPesel(pesel);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        PeselValidator peselValidator = new PeselValidator();
        boolean validate = peselValidator.validate(pesel);
        if (validate) {
            this.pesel = pesel;
        } else {
            throw new IllegalArgumentException("Niepoprawny PESEL!");
//            throw new IllegalStateException("Niepoprawny PESEL!");
        }
    }
}
