import java.util.ArrayList;

public class PruebaArrayList{
	public static void main(String[] args){
		//ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList<String>();

		al.add("Alice");
		al.add("Bob");
		al.add("Charlie");

		al.add(2, "David");
		//al.add(Integer.valueOf(5));		//Compila (sin generico), pero genera ClassCastException 

		al.remove(0);

		for(Object o: al){
			String name = (String) o;
			System.out.println(name + " " + name.length());
		}

		System.out.println("Todos los nombres: " + al);
	}
}