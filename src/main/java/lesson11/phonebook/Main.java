package lesson11.phonebook;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Petrov", "8888");
        phonebook.add("Ivanov", "9999");
        phonebook.add("Sidorov", "7777");
        phonebook.add("Belov", "4444");
        phonebook.add("Nosov", "5555");
        phonebook.add("Ivanov", "2222");
        phonebook.add("Zakharov", "1111");
        phonebook.add("Ivanov", "3333");

        phonebook.get("Petrov");
        phonebook.get("Sakharov");
        phonebook.get("Nosov");
        phonebook.get("Ivanov");
    }
}
