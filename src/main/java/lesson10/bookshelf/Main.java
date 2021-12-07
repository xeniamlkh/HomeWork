package lesson10.bookshelf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book<String> tempBook = new Book<>();

        Book<String>[] myBooks = new Book[5];
        myBooks[0] = new Book("Harry Potter and the Order of the Phoenix");
        myBooks[1] = new Book("Good Omens");
        myBooks[2] = new Book("The Call of Cthulhu");
        myBooks[3] = new Book("IT");
        myBooks[4] = new Book("The Girl on the Train");

        printBooksList(myBooks);

        changeOrder(myBooks, tempBook);

    }

    private static void printBooksList(Book<String>[] myBooks) {
        System.out.println("BOOKS ON THE SHELF");
        for (int i = 0; i < myBooks.length; i++) {
            System.out.println(i + 1 + " " + myBooks[i].getBookName());
        }
        System.out.println();
    }

    private static void changeOrder(Book<String>[] myBooks, Book<String> tempBook) {

        System.out.println("Changing books order...");
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the number of the first book you want to replace: ");
        int firstIndex = myInput.nextInt() - 1;
        System.out.print("Enter the number of the second book you want to replace: ");
        int secondIndex = myInput.nextInt() - 1;
        System.out.println();

        try {
            System.out.printf("You are replacing '%s' with '%s' %n", myBooks[firstIndex].getBookName(), myBooks[secondIndex].getBookName());
            tempBook = myBooks[firstIndex];
            myBooks[firstIndex] = myBooks[secondIndex];
            myBooks[secondIndex] = tempBook;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! You put a wrong number! Books will not be rearranged");
        }

        printBooksList(myBooks);

    }

}
