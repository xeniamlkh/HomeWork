package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan", "Accountant", "IvanovIvan@bestcompany.com", "+7 919 999 99 99", 50000, 24);
        employee1.printInfo();

        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Sidorov Andrey", "Engineer", "SidorovAndrey@bestcompany.com", "+7 919 000 00 00", 60000, 29);
        employeesArr[1] = new Employee("Popov Matvey", "DevOps", "PopovMatvey@bestcompany.com", "+7 919 111 11 11", 90000, 35);
        employeesArr[2] = new Employee("Petrov Petr", "CEO", "PetrovPetr@bestcompany.com", "+7 919 222 22 22", 100000, 41);
        employeesArr[3] = new Employee("Smirnova Elena", "Engineer", "SmirnovaElena@bestcompany.com", "+7 919 333 33 33", 60000, 30);
        employeesArr[4] = new Employee("Romanova Ekaterina", "HR", "RomanovaEkaterina@bestcompany.com", "+7 919 444 44 44", 50000, 56);

        for (Employee employee : employeesArr) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }

    }
}
