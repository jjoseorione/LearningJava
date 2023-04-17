public class PruebaCoordenadas{
	public static void main(String[] args){
		Coordenadas cord = new Coordenadas();
		cord.agregarPunto(1,1);
		cord.agregarPunto(2,2);
		cord.agregarPunto(3,3);
		cord.agregarPunto(4,4);
		cord.agregarPunto(-1,1);
		cord.agregarPunto(-2,5);
		cord.agregarPunto(-9,1);
		cord.agregarPunto(4,-1);
		cord.agregarPunto(-1,-1);
		cord.agregarPunto(0,1);
		cord.agregarPunto(5,0);

		System.out.println(cord.devuelvePuntosEnCuadrante(-1));		//2
		System.out.println(cord.devuelvePuntosEnCuadrante(0));		//0
		System.out.println(cord.devuelvePuntosEnCuadrante(1));		//4
		System.out.println(cord.devuelvePuntosEnCuadrante(2));		//3
		System.out.println(cord.devuelvePuntosEnCuadrante(3));		//1
		System.out.println(cord.devuelvePuntosEnCuadrante(4));		//1
	}
}