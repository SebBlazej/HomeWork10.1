package homework.model;

public class BookFactory {


    private BookFactory(){}


    public static Book createBook(String name, int pages){
        return new Book(name, pages);
    }

}
