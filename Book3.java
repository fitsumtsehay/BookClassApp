public class Book3 {
    public static void main(String[] args)
    {
        Book3 newbook=new Book3("java Book","John",20,"yes","Object oriented programming");
        System.out.println("Author: "+newbook.getAuthor());
        System.out.println("Book title: "+newbook.getTitle());
        System.out.println("Description: " +newbook.getDescription());
    }
    private String title;
    private String author;
    private String description;
    private double price;
    private String isInStock;

    public Book3() {

    }

    public Book3(String book_title, String author, double price, String isInStock, String description) {
        this.title = book_title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }

    public String setAuthor(String author) {
        this.author = author;
        return author;
    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public String setInStock(String isInStock) {
        this.isInStock = isInStock;
        return isInStock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;

    }
    public String isInStock(){
        return isInStock;
    }

    public String getDisplayText(){
        return title + " by " + author + "\n" + description;}
}

