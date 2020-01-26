package lesson03two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, ArrayList<Person>> book = new HashMap<>();

    public void addPerson(Person person) {
        String personSecondName = person.getSecondName();
        if (book.containsKey(personSecondName)) {
            book.get(personSecondName).add(person);
            return;
        }
        ArrayList<Person> newPerson = new ArrayList<>();
        newPerson.add(person);
        book.put(person.getSecondName(), newPerson);
        newPerson = null;
    }


    public ArrayList<String> getPhoneByPersonName(String personName) {
        ArrayList<String> res = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Person>> o : book.entrySet()) {
            if (o.getKey().equals(personName)) {
                for (Person el : o.getValue()) {
                    res.add(el.getPhone());
                }
            }
        }
        return res;
    }

    public ArrayList<String> getEmailByPersonName(String personName) {
        ArrayList<String> res = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Person>> o : book.entrySet()) {
            if (o.getKey().equals(personName)) {
                for (Person el : o.getValue()) {
                    res.add(el.getEmail());
                }
            }
        }
        return res;
    }

    public void getAll() {
        System.out.println(book);
    }
}
