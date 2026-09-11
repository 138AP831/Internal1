import java.lang.*;
class Book {
int p;
int d;
String name;
Book(int price) {
 p = price;
 System.out.println("price of book = " + price);

} 
Book(int date, String n) {
d = date;
name = n;
System.out.println("year = " + date);
System.out.println("name = " + n);


    }  
}
class Demo1 {
    public static void main(String arr[]) {                
Book b = new Book(10);              
Book b2 = new Book(2007,"preetam");
}
}