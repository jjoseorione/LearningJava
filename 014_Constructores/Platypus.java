/* Uso de this para referenciar otros constructores de la misma clase
Fuente: https://www.infoworld.com/article/2076204/understanding-constructors.html#:~:text=Like%20methods%2C%20constructors%20can%20have,native%20%2C%20static%20%2C%20or%20synchronized%20. */

/*Like methods, constructors can have any of the access modifiers: public, 
protected, private, or none (often called package or friendly). Unlike 
methods, constructors can take only access modifiers. Therefore, 
constructors cannot be abstract, final, native, static, or synchronized.

The return types are very different too. Methods can have any valid return 
type, or no return type, in which case the return type is given as void. 
Constructors have no return type, not even void.

Finally, in terms of the signature, methods and constructors have different 
names. Constructors have the same name as their class; by convention, methods 
use names other than the class name. If the Java program follows normal 
conventions, methods will start with a lowercase letter, constructors with 
an uppercase letter. Also, constructor names are usually nouns because class 
names are usually nouns; method names usually indicate actions.*/

public class Platypus{
	String name;

	public Platypus(String input){
		name = input;
	}

	public Platypus(){
		this("Jane Doe");	//Llama al constructor que requiera una cadena como argumento
	}

	public void printName(){
		System.out.println("Name: " + name);
	}

	public static void main(String[] args){
		Platypus p1 = new Platypus("Digger");
		Platypus p2 = new Platypus();

		p1.printName();
		p2.printName();
	}
}