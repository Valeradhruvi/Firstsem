class Book{
    private String author_name;

     public Book(String author_name){
        this.author_name = author_name;
    }
    public void print(){
        System.out.println("Author Name: "+this.author_name);
    }
}
class Book_publication extends Book{
    private String title;

   public Book_publication(String author_name, String title){
        super(author_name);
        this.title = title;
    }

    public void print(){
        System.out.println("-------- Book ---------");
        super.print();
        System.out.println("Title Name : "+this.title);
    }
}
class Paper_publication extends Book{
    private String title;

      public Paper_publication(String author_name, String title){
       super(author_name);
       this.title = title;
    }

    public void print(){
        System.out.println("-------- paper ---------");
        super.print();
        System.out.println("Title Name: "+this.title);
    }
}

public class BookDemo{
    public static void main(String[] args){
        if(args.length==3){
            Book b1;
            if(args[1].equalsIgnoreCase("book")){
                b1 = new Book_publication(args[0] , args[2]);
            }
            else if(args[1].equalsIgnoreCase("paper")){
                b1 = new Paper_publication(args[0], args[2]);
            }
            else{
                b1 = new Book(args[0]);
            }

            b1.print();
        }
        else{
            System.out.println("Sorry Invalid details!!");
        }
    }
}