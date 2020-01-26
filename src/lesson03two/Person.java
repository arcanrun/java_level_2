package lesson03two;

public class Person {
    private String secondName;
    private String email;
    private String phone;

    Person(String secondName, String email, String phone) {
        this.secondName = secondName;
        this.email = email;
        this.phone = phone;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {

        return String.format("%s, %s", email, phone);
    }


}
