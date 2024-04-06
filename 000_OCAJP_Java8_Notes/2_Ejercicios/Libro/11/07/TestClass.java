import java.io.*;

class TransformerFactory{
	public Transformer getTransformer(String type){
		switch(type){
			case "xml":
				return new XMLTransformer();
			case "network":
				return new NetworkTransformer();
			default:
				return new DefaultTransformer();

		}
	}
}

abstract class Transformer{
	public abstract String transform(String Data) throws IOException;
}

class XMLTransformer extends Transformer{
	public String transform(String Data){ return "xmldata"; }
}

class NetworkTransformer extends Transformer{
	public String transform(String Data) throws IOException { return "data from network"; }
}

class DefaultTransformer extends Transformer{
	public String transform(String Data) {return "dummy"; }
}

public class TestClass{
	public static void main(String[] args) throws Exception{
		TransformerFactory tf = new TransformerFactory();
		NetworkTransformer nt = (NetworkTransformer) tf.getTransformer("network");	//Sin casting no funciona
		XMLTransformer xt = (XMLTransformer) tf.getTransformer("xml");
		DefaultTransformer ot = (DefaultTransformer) tf.getTransformer("Otro");
		System.out.println(nt.transform("hola"));
		System.out.println(xt.transform("adios"));
		System.out.println(ot.transform("hola"));
	}
}