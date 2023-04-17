//Ejemplo de colaboración de clases. La clase cliente es usada por la clase Banco

import java.util.Scanner;

public class Banco{
	private Cliente[] clientes;
	private float saldoTotal;
	private String nombreBanco;
	private int numClientes = 0;

	public Banco(){
		nombreBanco = "Unnamed bank";
		clientes = new Cliente[10];
	}

	public Banco(String nombreBanco, int maxClientes){
		this.nombreBanco = nombreBanco;
		if(maxClientes > 10)
			maxClientes = 10;
		this.clientes = new Cliente[maxClientes];
	}

	public boolean setNombreBanco(String nombreBanco){
		if(this.nombreBanco.equals("Unnamed bank")){
			this.nombreBanco = nombreBanco;
			return true;	
		}
		else
			return false;
	}

	public String getNombreBanco(){
		return nombreBanco;
	}

	public int getNumClientes(){
		return numClientes;
	}

	public int getMaxClientes(){
		return clientes.length;
	}

	private void calculaSaldoBanco(){
		saldoTotal = 0;
		for(int i = 0; i < numClientes; i++){
			saldoTotal += clientes[i].getSaldoCliente();
		}
	}

	public float getSaldoBanco(){
		calculaSaldoBanco();
		return saldoTotal;
	}

	public void addCliente(){
		clientes[numClientes] = new Cliente();
		numClientes++;
	}

	public void addCliente(String nombre, float saldo){
		clientes[numClientes] = new Cliente(nombre, saldo);
		numClientes++;
	}

	public boolean delCliente(int c){
		if(c >= numClientes)
			return false;
		else{
			clientes[c] = null;
			for(int i = c; i <= (numClientes-1); i++)
				clientes[i] = clientes[i+1];
			numClientes--;
			return true;
		}
	}

	public Cliente[] getClientesBanco(){
		return clientes;
	}

	public Cliente getCliente(int c){
		return clientes[c];
	}
}