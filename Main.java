//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Book {
    public String title = "title";
    public String author = "author";
    public double price = 9.99;

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.printInfo();
    }
}