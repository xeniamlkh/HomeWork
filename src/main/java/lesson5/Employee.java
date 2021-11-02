package lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.printf("A new account has been created%n User's name: %s%n User's position: %s%n User's email: %s%n User's phone: %s%n User's salary (rub): %d%n User's age: %d%n", name, position, email, phone, salary, age);
    }
}