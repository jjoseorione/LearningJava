import java.util.Scanner;

public class Banco{
	private Cliente c1, c2, c3;
	private float saldoTotal;

	public Banco(Cliente c1, Cliente c2, Cliente c3){
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		saldoTotal = c1.devuelveSaldo() + c2.devuelveSaldo() + c3.devuelveSaldo();
	}

	public Banco(){
		c1 = new Cliente();
		c2 = new Cliente();
		c3 = new Cliente();
		saldoTotal = c1.devuelveSaldo() + c2.devuelveSaldo() + c3.devuelveSaldo();
	}

	public void premio100(){
		this.c1.depositar(100);
		this.c2.depositar(100);
		this.c3.depositar(100);
	}

	public void multa50(){
		this.c1.retirar(50);
		this.c2.retirar(50);
		this.c3.retirar(50);
	}

	private void calculaSaldo(){
		saldoTotal = c1.devuelveSaldo() + c2.devuelveSaldo() + c3.devuelveSaldo();
	}

	public float devuelveSaldo(){
		calculaSaldo();
		return saldoTotal;
	}

	public static void main(String[] args){
		Banco b = new Banco();
		b.premio100();
		System.out.print("\n\t" + b.devuelveSaldo());
	}


}