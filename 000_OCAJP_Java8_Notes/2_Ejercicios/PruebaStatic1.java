class Book{
	int name;
	public Book(int name){
		this.name = name;
	}

	static void printName(){
		Book b1 = new Book(1);
		Book b2 = new Book(2);
		System.out.println(b1.name);
		System.out.println(b2.name);
	}

	static void printName(Book b){
		System.out.println(b.name);
	}
}

public class PruebaStatic1{
	public static void main(String[] args){
		Book.printName();		//Imprime 1 y 2

		Book b300 = new Book(300);
		Book.printName(b300);		//Imprime 300

	}
}