
class LibraryItem {
	 String title;
	 String publisher;
	 int year;
	 String language;
	 String category;
	 String itemId;
	
	 LibraryItem() {
		super();
		this.title = "Introduction to Java Programming";
		this.publisher = "Pearson Education";
		this.year = 2021;
		this.language = "English";
		this.category = "Programming";
		this.itemId = "B101";
	}
	 
	 LibraryItem(String title, String publisher, int year, String language, String category, String itemId) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		this.language = language;
		this.category = category;
		this.itemId = itemId;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getPublisher() {
		return publisher;
	}

	void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	String getLanguage() {
		return language;
	}

	void setLanguage(String language) {
		this.language = language;
	}

	String getCategory() {
		return category;
	}

	void setCategory(String category) {
		this.category = category;
	}

	String getItemId() {
		return itemId;
	}

	void setItemId(String itemId) {
		this.itemId = itemId;
	}
	 
	 void display () {
		 System.out.println("Title is : "+this.title);
		 System.out.println("Publisher name is : "+this.publisher);
		 System.out.println("Year : "+this.year);
		 System.out.println("Language is : "+this.language);
		 System.out.println("Category is : "+this.category);
		 System.out.println("Item Id is : "+this.itemId);
	 }	
}//Library Item ends here

class Book extends LibraryItem {
	String author;
	String isbn;
	String edition;
	Book() {
		super();
		this.author = "Herbert Schildt";
		this.isbn = "978-1260440218";
		this.edition = "11th Edition";
	}
	Book(String title, String publisher, int year, String language, String category, String itemId,String author, String isbn, String edition) {
		super(title,publisher,year,language,category,itemId);
		this.author = author;
		this.isbn = isbn;
		this.edition = edition;
	}
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	String getIsbn() {
		return isbn;
	}
	void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	String getEdition() {
		return edition;
	}
	void setEdition(String edition) {
		this.edition = edition;
	}
	
	void display () {
		super.display();
		System.out.println("Author name is : "+this.author);
		System.out.println("ISBN is : "+this.isbn);
		System.out.println("Edition is : "+this.edition);
	}
	
	
}//Book ends here

class NewsPaper extends LibraryItem {
	String date;
	String editor;
	String headline;
	NewsPaper() {
		super();
		this.date = "2025-09-20";
		this.editor = "John Matthews";
		this.headline = "AI Revolutionizes Software Development";
	}
	NewsPaper(String title, String publisher, int year, String language, String category, String itemId,String date, String editor, String headline) {
		super(title,publisher,year,language,category,itemId);
		this.date = date;
		this.editor = editor;
		this.headline = headline;
	}
	String getDate() {
		return date;
	}
	void setDate(String date) {
		this.date = date;
	}
	String getEditor() {
		return editor;
	}
	void setEditor(String editor) {
		this.editor = editor;
	}
	String getHeadline() {
		return headline;
	}
	void setHeadline(String headline) {
		this.headline = headline;
	}
	
	void display () {
		super.display();
		System.out.println("Date is : "+this.date);
		System.out.println("Editor is : "+this.editor);
		System.out.println("Headline is : "+this.headline);
	}
	
}//Newspaper ends here

class Magazine extends LibraryItem {
	int issueNo;
	String frequency;
	String editor;
	Magazine() {
		super();
		this.issueNo = 42;
		this.frequency = "Monthly";
		this.editor = "Emily Johnson";
	}
	Magazine(String title, String publisher, int year, String language, String category, String itemId,int issueNo, String frequency, String editor) {
		super(title,publisher,year,language,category,itemId);
		this.issueNo = issueNo;
		this.frequency = frequency;
		this.editor = editor;
	}
	int getIssueNo() {
		return issueNo;
	}
	void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}
	String getFrequency() {
		return frequency;
	}
	void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	String getEditor() {
		return editor;
	}
	void setEditor(String editor) {
		this.editor = editor;
	}
	
	void display () {
		super.display();
		System.out.println("Issue number is : "+this.issueNo);
		System.out.println("Frequency is : "+this.frequency);
		System.out.println("Editor is : "+this.editor);
	}
	
	
}//Magazine ends here

class TestLibraryItem {
	public static void main (String [] args) {
		LibraryItem l1 = new LibraryItem ();
		l1.display();
		
		System.out.println();
		
		LibraryItem l2 = new LibraryItem ("Introduction to Java Programming","Pearson Education",2021,"English","Programming","B101");
		l2.display();
		
		System.out.println();
		
		Book b1 = new Book ();
		b1.display();
		
		System.out.println();
		
		Book b2 = new Book ("Database System Concepts","McGraw Hill",2020,"English","Database","B102","Herbert Schildt","978-1260440218","11th Edition");
		b2.display();
		
		System.out.println();
		
		NewsPaper  n1 = new NewsPaper();
		n1.display();
		
		System.out.println();
		
		NewsPaper n2 = new NewsPaper("Database System Concepts","McGraw Hill",2020,"English","Database","B102","2022-12-3","Emily Johnson","AI Revolutionizes Software Development");
		n2.display();
		
		System.out.println();
		
		Magazine m1 = new Magazine ();
		m1.display();
		
		System.out.println();
		
		Magazine m2 = new Magazine ("Database System Concepts","McGraw Hill",2020,"English","Database","B102",42,"Monthly","Emily Johnson");
		m2.display();
	}
}

