package mybook;

public class DocumentManager {
    private static DocumentManager instance;
    Book book;

    protected DocumentManager() {
    }

    public static DocumentManager getInstance() {
        if(instance == null)
        {
            instance = new DocumentManager();
        }
        return instance;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
