import java.util.Scanner;

public class Cliente{
	private String nombre;
	private float saldo;

	public Cliente(String nombre, float saldo){
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public Cliente(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("\n\tNombre: ");
		nombre = teclado.next();
		System.out.print("\tSaldo Inicial: ");
		saldo = teclado.nextFloat();
	}

	public void depositar(float monto){
		saldo += monto;
	}

	public void depositar(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("\n\tMonto de deposito: ");
		saldo += teclado.nextFloat();
	}

	public void retirar(float monto){
		saldo -= monto;
	}

	public void retirar(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("\n\tMonto de retiro: ");
		saldo -= teclado.nextFloat();
	}

	public float devuelveSaldo(){
		return saldo;
	}
}