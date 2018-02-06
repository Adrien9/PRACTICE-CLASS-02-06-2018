package Book;

public class Booktest {

	public static void main(String[] args) {


		Book book=new Book("J.K Rowling", "1995", "123-6-47-589087-3", 5.95);

		System.out.println("Book 1");
		System.out.println(book.author);
		System.out.println(book.year);
		System.out.println(book.isbn);
		System.out.println(book.price);

		Book book2=new Book("George Orwell", "1960", "123-4-56-789101-1", 10.95);

		System.out.println("Book 2");
		System.out.println(book2.author);
		System.out.println(book2.year);
		System.out.println(book2.isbn);
		System.out.println(book2.price);
	}
}