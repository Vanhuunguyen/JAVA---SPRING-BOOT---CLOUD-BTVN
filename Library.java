package QLTV;

import java.util.*;

public class Library {
   public List<Book> books = new ArrayList<>();
   public Set<String> borrowedBooks = new HashSet<>();
   public Map<String, String> borrowedBy = new HashMap<>();

   public void addBook (Book book){
       books.add(book);
   }
   public void borrowBook(String ISBN, String borrower) throws Exception {
       if (borrowedBooks.contains(ISBN)){
           throw new Exception("sach da duoc muon");
       }
       for (Book book:books){
           if (book.getISBN().equals(ISBN)){
               borrowedBooks.add(ISBN);
               borrowedBy.put(ISBN, borrower);
               return;
           }
       }
       throw new Exception("khong tim thay sach co ma so " + ISBN);

   }
   public void returnBook(String ISBN) throws Exception{
       if (!borrowedBooks.contains(ISBN)){
           throw new Exception("sach co ms " + ISBN + "chua duoc muon");
       }
       for (Book book:books){
           if (book.getISBN().equals(ISBN)){
               borrowedBooks.remove(ISBN);
               borrowedBy.remove(ISBN);
               System.out.println("sach co ma so " + ISBN + "da dc tra");
           }
       }
   }
   public  void displayBooks(){
       System.out.println("sach trong thu vien la ");
       for (Book book:books){
           System.out.println(book);
       }
   }

}
