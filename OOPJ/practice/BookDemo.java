    abstract class Book {
    String bookTitle;
    String authorName;

    public Book(String bookTitle, String authorName){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
    }
    
}

class BookDetails extends Book{
    double price;
    int stockOfBook;

    public BookDetails(String bookTitle, String authorName, double price, int stockOfBook){
        super(bookTitle, authorName);
        this.price = price;
        this.stockOfBook = stockOfBook;
    }
    void mainDetails(){
        System.out.println(authorName);
        System.out.println(bookTitle);
        System.out.println(price);
        System.out.println(stockOfBook);
    }
    
}

public class BookDemo {
    public static void main(String[] args) {
        
        BookDetails obj1 = new BookDetails("Life is lie","Selena Gomez", 10000, 12);
        obj1.mainDetails();

    }
}
