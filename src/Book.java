public class Book extends Product {

    private String author;
    private int pages;

//    CONSTRUCTORS

    public Book() { //default constructor

    }

    public Book(String author, int pages){  // overloaded constructor
        super();
        this.author = author;
        this.pages = pages;
    }

//    SETTERS AND GETTERS
    //void set argument assign
    //type get return

    public void setPages(int pages){
        this.pages=pages;
    }

    public int getPages(){
        return this.pages;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getAuthor(String author){
        return this.author;
    }



//    METHODS







}