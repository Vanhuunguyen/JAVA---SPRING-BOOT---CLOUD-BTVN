package QLTV;

public class main {
    public static void main(String[] args) {
        Library lb = new Library();
        Book bk1 = new Book("lao hac", "Nam Cao", "001");
        Book bk2 = new Book("tat den", "Ngo tat to", "002");
        Book bk3 = new Book("de men", "To Hoai", "003");
        Book bk4 = new Book("vo nhat", "Kim Lan", "004");
        Book bk5 = new Book("tay tien", "Quang Dung", "005");
        lb.addBook(bk1);
        lb.addBook(bk2);
        lb.addBook(bk3);
        lb.addBook(bk4);
        lb.addBook(bk5);

        lb.displayBooks();
        try {
            lb.borrowBook("002", "Huy");
            lb.borrowBook("001", "Ha");
            lb.displayBooks();
            lb.returnBook("006");
            lb.displayBooks();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
