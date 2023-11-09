public class PruebaSobrecarga{
	public static void main(String[] args){
		System.out.println("Holi");
		metodo1(2, 5.3);
	}

	public static void metodo1(int perro, double gato){
		System.out.println("Perro primero");
		return;
	}

	public static void metodo1(double gato, int perro){
		System.out.println("Gato primero");
		return;
	}
}