package lesson03two;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Person ivan = new Person("Petrov", "Ivan@mail.com", "89999999990");
        Person jim = new Person("Brown", "email1@mail.com", "89999999991");
        Person nick = new Person("Petrov", "Nick@mail.com", "89999999992");

        phoneBook.addPerson(ivan);
        phoneBook.addPerson(jim);
        phoneBook.addPerson(nick);
        System.out.println(phoneBook.getPhoneByPersonName("Brown"));
        System.out.println(phoneBook.getEmailByPersonName("Petrov"));
    }
}
