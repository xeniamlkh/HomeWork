package lesson11.phonebook;

import java.util.HashMap;

public class Phonebook {
    private HashMap<String, String> map;

    public Phonebook() {
        this.map = new HashMap<String, String>();
    }

    public void add(String surname, String phone) {
        if (map.containsKey(surname)) {
            map.put(surname, map.get(surname) + ", " + phone);
        } else {
            map.put(surname, phone);
        }
    }

    public void get(String surname) {
        if (map.get(surname) == null) {
            System.out.printf("%s: NO TELEPHONE NUMBER %n", surname);
        } else {
            System.out.printf("%s: %s %n", surname, map.get(surname));
        }
    }
}
