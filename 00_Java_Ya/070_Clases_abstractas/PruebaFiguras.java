public class PruebaFiguras{
	public static void main(String[] args){
		Cuadrado c1 = new Cuadrado("Azul", 5);
		System.out.print(c1.calcularArea() + "\n");
		Cuadrado c2 = new Cuadrado("Verde", 8);
		System.out.print(c2.calcularArea() + "\n");
		Triangulo t1 = new Triangulo("Rosa", 7, 4);
		Figura f1 = new Figura("Lila");
		System.out.print(t1.calcularArea() + "\n");
		System.out.print(c1.getColor() + "\n");
		System.out.print(c2.getColor() + "\n");
		System.out.print(t1.getColor() + "\n");
		System.out.print(f1.getColor() + "\n");
	}
}