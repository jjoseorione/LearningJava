import java.util.Scanner;

public class Init{
	public static Scanner teclado = new Scanner(System.in);
	public static int r;
	public static int numBancos = 0;
	public static Banco[] bancos = new Banco[10];

	public static void listBanks(){
		System.out.println("Lista de bancos:");
		for(int i = 0; i < numBancos; i++){
			System.out.println();
			System.out.print((i+1) + ". " + bancos[i].getNombreBanco() +
				"............" + bancos[i].getNumClientes() + "/" + bancos[i].getMaxClientes());
		}
		System.out.println();
	}

	public static void workBank(Banco bank){
		int r;
		do{
			System.out.println();
			System.out.println("********** " + bank.getNombreBanco() + " **********");
			System.out.println();
			System.out.println("1. Agregar cliente");
			System.out.println("2. Listar clientes");
			System.out.println("3. Eliminar cliente");
			System.out.println("4. Trabajar con cliente");
			System.out.println("5. Agregar nombre a banco");

			System.out.println();
			System.out.println("0. Regresar al menú anterior");
			System.out.println();
			System.out.print("====> ");
			r = teclado.nextInt();

			switch(r){
				case 1:
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					System.out.println();
					System.out.println("********** Agregar cliente a " + bank.getNombreBanco() + " **********");
					System.out.println();
					if(bank.getNumClientes() == bank.getMaxClientes()){
						System.out.println();
						System.out.println("\tNo pueden agregarse más clientes.");
						break;
					}
					if(bank.getNumClientes() % 2 != 0)
						bank.addCliente();
					else{
						System.out.println("Escriba el nombre del Cliente y su saldo inicial:");
						System.out.println();
						bank.addCliente(teclado.next(), teclado.nextFloat());
					}
					System.out.println();
					System.out.println("Se ha agregado el cliente.");
					break;

				case 2:		//Listar clientes
					System.out.print("\033[H\033[2J"); 
					System.out.flush(); 
					listClients(bank);
					break;

				case 3:		//Eliminar cliente
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					System.out.println();
					listClients(bank);
					System.out.print("====> ");
					if(bank.delCliente(teclado.nextInt()-1)){
						System.out.println();
						System.out.println("Cliente eliminado");
					}
					else{
						System.out.println();
						System.out.println("***Error***");
					}
					break;
				case 4:		//Trabajar con cliente
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					System.out.println();
					System.out.print("Elegir cliente: ");
					System.out.println();
					listClients(bank);
					System.out.println();
					System.out.print("====>: ");
					int client = teclado.nextInt();
					if(client > bank.getNumClientes())
						System.out.println("No existe el cliente " + client);
					else
						workClient(bank.getCliente(client-1));
					break;
				case 5:		//Agregar nombre a banco sin nombre
					System.out.print("\033[H\033[2J"); 
					System.out.flush(); 
					System.out.println("Escriba el nombre del banco: ");
					if(bank.setNombreBanco(teclado.next())){
						System.out.println();
						System.out.println("Nombre actualizado con éxito.");
					}
					else{
						System.out.println();
						System.out.println("El nombre no puede ser cambiado.");
					}
					break;
				default:
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					System.out.println();
					System.out.println("\nOpción inválida.");
					break;
			}
		}while(r != 0);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void listClients(Banco bank){
		System.out.println("Lista de clientes del banco " + bank.getNombreBanco() + ": ");
		for(int i = 0; i < bank.getNumClientes(); i++){
			System.out.println();
			System.out.print((i+1) + ". " + bank.getCliente(i).getNombreCliente() +
				"............" + bank.getCliente(i).getSaldoCliente());
		}
		System.out.println();
	}

	public static void workClient(Cliente client){
		int r;
		do{
			System.out.println();
			System.out.println("Cliente: " + client.getNombreCliente());
			System.out.println("Saldo:   " + client.getSaldoCliente());
			System.out.println();
			System.out.println("1. Cambiar nombre");
			System.out.println("2. Depositar");
			System.out.println("3. Retirar");

			System.out.println();
			System.out.println("0. Regresar al menú anterior");
			System.out.println();
			System.out.print("====> ");
			r = teclado.nextInt();

			switch(r){
				case 1:
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println();
					System.out.println("Escriba el nuevo nombre: ");
					client.setNombreCliente(teclado.next());
					System.out.println();
					System.out.println("Nombre actualizado correctamente");
					break;
				case 2:
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println();
					if(client.getSaldoCliente() % 2 == 0){
						System.out.println("Escriba la cantidad a depositar: ");
						client.depositar(teclado.nextFloat());
						System.out.println();
						System.out.println("Importe abonado correctamente");
					}
					else
						client.depositar();
					System.out.println();
					break;

				case 3:
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println();
					if(client.getSaldoCliente() % 2 == 0){
						System.out.println("Escriba la cantidad a retirar: ");
						client.retirar(teclado.nextFloat());
						System.out.println();
						System.out.println("Importe retirado correctamente");
					}
					else
						client.retirar();
					System.out.println();
					break;

				case 0:
					break;

				default:
					System.out.println();
					System.out.println("Error. Intente nuevamente.");
					System.out.println();
					break;

			}

		}while(r != 0);
	}

	public static void main(String[] args){
		System.out.print("\033[H\033[2J");
		System.out.flush();
		do{
			System.out.println();
			System.out.println("****************************************");
			System.out.println();
			System.out.println("1. Crear banco");
			System.out.println("2. Listar bancos");
			System.out.println("3. Trabajar con un banco");
			System.out.println("4. Finalizar");
			System.out.println();
			System.out.print("====>: ");
			r = teclado.nextInt();

			switch(r){
				case 1:		//Crear banco
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					if(numBancos == 10){
						System.out.println();
						System.out.println("\tNo pueden crearse más bancos.");
						break;
					}
					if(numBancos % 2 == 0)
						bancos[numBancos] = new Banco();
					else{
						System.out.println("Escriba el nombre del Banco y cantidad esperada de clientes:");
						System.out.println();
						bancos[numBancos] = new Banco(teclado.next(), teclado.nextInt());
					}
					numBancos++;
					System.out.println("Banco creado.");
					break;

				case 2:		//Listar bancos
					System.out.print("\033[H\033[2J"); 
					System.out.flush(); 
					listBanks();
					break;

				case 3:		//Trabajar con bancos
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					System.out.println();
					System.out.print("Elegir banco: ");
					System.out.println();
					listBanks();
					System.out.println();
					System.out.print("====>: ");
					int bank = teclado.nextInt();
					if(bank > numBancos)
						System.out.println("No existe el banco " + bank);
					else
						workBank(bancos[bank-1]);
					break;

				case 4:		//Salir
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					System.out.println();
					System.out.println("Hasta luego.");
					break;

				default:
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					System.out.println();
					System.out.println("\nOpción inválida.");
					break;
			}
		}while(r != 4);
	}
}