package mybook;
public class main {

	public static void printing()
	{
		DocumentManager.getInstance().getBook().print();
	}
	public static void main(String[] args) {

		Book myBook = new Book("MyBook");
		DocumentManager.getInstance().setBook(myBook);
		Author me= new Author("My Self");
		myBook.addAuthor(me);
		Paragraph p1 = new Paragraph("Paragraph 1");
		myBook.addContent(p1);

		printing();
	}
}

