public class Book {
    private int id;
    private String name;
    private String subject;
    private int price;

    public Book(int id, String name, String subject, int price) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSubject() {
        return subject;
    }

}
