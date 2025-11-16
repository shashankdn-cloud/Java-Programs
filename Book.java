import java.util.Stack;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (Rs " + price + ")";
    }

    public static void main(String[] args) {
        Stack<Book> S = new Stack<>();
        S.push(new Book("The White Tiger", "Aravind Adiga", 499));
        S.push(new Book("The God of Small Things", "Arundhati Roy", 350));
        S.push(new Book("Train to Pakistan", "Khushwant Singh", 350));
        System.out.println("Books in stack:");
        for (Book b : S) {
            System.out.println(b);
        }
        System.out.println("\nTop book (peek): " + S.peek());
        System.out.println("\nPopping top book: " + S.pop());
        System.out.println("\nBooks after pop:");
        for (Book b : S) {
            System.out.println(b);
        }
        System.out.println("\nIs stack empty? " + S.isEmpty());
    }
}