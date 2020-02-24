package homework.model;

public class Book {

    private String name;
    private int pages;

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + pages;
        return result;
    }
}
