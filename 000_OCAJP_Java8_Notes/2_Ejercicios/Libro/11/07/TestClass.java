import java.io.*;

//Si esta clase es pública y las clases Transformer son default, pero se encuentran
//todas dentro del mismo paquete, sólo sería posible crear objetos Transformer por
//medio de la clase TransformerFactory
class TransformerFactory{
	public Transformer getTransformer(String type){
		type = type == null ? "" : type;
		switch(type){
			case "xml":
				return XMLTransformer.nuevo();
			case "network":
				return NetworkTransformer.nuevo();
			default:
				return DefaultTransformer.nuevo();
		}
	}
}

abstract class Transformer{
	public abstract String transform(String Data) throws IOException;
	public static Transformer nuevo(){ return null; }
}

class XMLTransformer extends Transformer{
	//Se hace privado al constructor para que tenga sentido tener una clase
	//que crea transformadores, aunque no lo pida el ejercicio
	private XMLTransformer(){}
	public static XMLTransformer nuevo(){
		return new XMLTransformer();
	}
	public String transform(String Data){ return "xmldata"; }
}

class NetworkTransformer extends Transformer{
	//Se hace privado al constructor para que tenga sentido tener una clase
	//que crea transformadores, aunque no lo pida el ejercicio
	private NetworkTransformer(){}
	public static NetworkTransformer nuevo(){
		return new NetworkTransformer();
	}
	public String transform(String Data) throws IOException { return "data from network"; }
}

class DefaultTransformer extends Transformer{
	//Se hace privado al constructor para que tenga sentido tener una clase
	//que crea transformadores, aunque no lo pida el ejercicio
	private DefaultTransformer(){}
	public static DefaultTransformer nuevo(){
		return new DefaultTransformer();
	}
	public String transform(String Data) {return "dummy"; }
}

public class TestClass{
	public static void main(String[] args) throws Exception{
		TransformerFactory tf = new TransformerFactory();
		Transformer[] trs = new Transformer[]{
			tf.getTransformer("xml") ,
			tf.getTransformer("network") ,
			tf.getTransformer(null)
		};

		for(Transformer t : trs)
			System.out.println(t.transform("Algo"));


		// TransformerFactory tf = new TransformerFactory();
		// NetworkTransformer nt = (NetworkTransformer) tf.getTransformer("network");	//Sin casting no funciona
		// XMLTransformer xt = (XMLTransformer) tf.getTransformer("xml");
		// DefaultTransformer ot = (DefaultTransformer) tf.getTransformer("Otro");
		// System.out.println(nt.transform("hola"));
		// System.out.println(xt.transform("adios"));
		// System.out.println(ot.transform("hola"));
	}
}