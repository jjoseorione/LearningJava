public class TestClass{
	public static void main(String[] args){
		Document d = new PdfDocument();
		System.out.println(d.getType());	//debe imprimir "pdf"
	}
}

class Document{
	private String type = "dummy";
	private byte[] data;	//Insertar setters y getters apropiados

	public String getType(){
		return this.type;
	}

	public byte[] getData(){
		return data;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setData(byte[] data){
		this.data = data;
	}
}

class PdfDocument extends Document{
	private String type = "pdf";
	private byte[] data;

	//Este método permite que se tome el campo type de PdfDocument
	//Si este método no se sobreescribe, se tomará el método heredado
	//por Document, el cual toma el campo de Document. El método de Document
	//no tiene manera de saber que existe un campo type en PdfDocument.
	public String getType(){
		return this.type;
	}
}