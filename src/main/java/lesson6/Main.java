package lesson6;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();

        Dog myDog = new Dog();
        Dog myDog2 = new Dog();

        System.out.println(myCat.run(50));
        System.out.println(myCat.swim(35));

        System.out.println(myCat2.run(150, 300));
        System.out.println(myCat2.swim(40, 50));

        System.out.println(myCat3.run(200, 400));
        System.out.println(myCat3.swim(10, 5));

        System.out.println(myDog.run(350));
        System.out.println(myDog.swim(97));

        System.out.println(myDog2.run(600, 700));
        System.out.println(myDog2.swim(40, 50));

        System.out.println(myCat);
        System.out.println(myDog);


    }

}
