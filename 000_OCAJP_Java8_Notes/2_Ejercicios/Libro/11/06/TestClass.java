import java.io.*;

abstract class Transformer{
	public abstract String transform(String Data) throws IOException;
}

class XMLTransformer extends Transformer{
	public String transform(String Data){ return "xmldata"; }
}

class NetworkTransformer extends Transformer{
	public String transform(String Data) throws IOException { return "data from network"; }
}

public class TestClass{
	public static void main(String[] args) throws Exception{
		Transformer xt = new XMLTransformer();
		Transformer nt = new NetworkTransformer();
		System.out.println(nt.transform("hola"));
		System.out.println(xt.transform("adios"));
	}
}