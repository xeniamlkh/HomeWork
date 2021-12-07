package lesson10.bookshelf;

public class Book<T> {
    private T bookName;

    public Book(T bookName) {
        this.bookName = bookName;
    }

    public Book() {
        this.bookName = null;
    }

    public T getBookName() {
        return bookName;
    }

}
