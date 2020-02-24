package homework.test;

import homework.app.BooksTableInput;
import homework.model.Book;

import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {

        BooksTableInput booksTableInput = new BooksTableInput();

        Book[] books = booksTableInput.getTableOfUniqueBooks();

        System.out.println(Arrays.toString(books));


    }
}
