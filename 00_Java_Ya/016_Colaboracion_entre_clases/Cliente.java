//En esta primera clase se puede apreciar la forma en la que se puede realizar sobreescritura de métodos
//y de constructores.

import java.util.Scanner;

public class Cliente{
	private String nombre;
	private float saldo;
	private static Scanner teclado = new Scanner(System.in);

	public Cliente(String nombre, float saldo){
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public Cliente(){
		System.out.print("\n\tNombre Cliente: ");
		nombre = teclado.next();
		System.out.print("\tSaldo Inicial Cliente: ");
		saldo = teclado.nextFloat();
	}

	public void depositar(float monto){
		saldo += monto;
	}

	public void depositar(){
		System.out.print("\n\tMonto de deposito: ");
		saldo += teclado.nextFloat();
	}

	public void retirar(float monto){
		saldo -= monto;
	}

	public void retirar(){
		System.out.print("\n\tMonto de retiro: ");
		saldo -= teclado.nextFloat();
	}

	public void setNombreCliente(String nombre){
		this.nombre = nombre;
	}

	public String getNombreCliente(){
		return nombre;
	}

	public float getSaldoCliente(){
		return saldo;
	}
}