package homework.app;

import homework.model.Book;
import homework.model.BookFactory;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BooksTableInput {

    private Scanner scanner = new Scanner(System.in);

    public BooksTableInput() {
        scanner.useLocale(Locale.US);
    }

    public Book[] getTableOfUniqueBooks() {
        HashSet<Book> bookTable = new HashSet<>();

        fillTableWithUniqueBooks(bookTable);

        return bookTable.toArray(new Book[3]);
    }

    private void fillTableWithUniqueBooks(HashSet<Book> bookTable){
        while (bookTable.size() < 3) {
            if (bookTable.add(this.getBook())) {
                if (bookTable.size() < 3) System.out.println("Poprawna książka. Podaj dane następnej.");
                else System.out.println("Wczytales 3 unikalne książki.");
            } else System.out.println("Twoja ksiazka jest juz w bazie. Podaj następną");
        }
    }


    private Book getBook() {

        String name = setBookName();
        int pages = setBookPages();

        return BookFactory.createBook(name, pages);

    }


    private String setBookName() {
        String bookName = "";
        System.out.println("Podaj nazwe ksiazki: ");
        do {
            try {
                bookName = scanner.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Error. Błędnie podana nazwa książki. Spróbuj jeszcze raz: ");
            }
        } while (bookName.isEmpty());
        return bookName;
    }

    private int setBookPages() {
        int pages = 0;
        System.out.println("Podaj ilosc stron: ");
        do {
            try {
                pages = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException ex) {
                scanner.nextLine();
                System.out.println("Error. Błędnie podana ilość stron. Spróbuj jeszcze raz: ");
            }
        } while (pages == 0);
        return pages;
    }


}
