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
	public String type = "pdf";
	private byte[] data;

	public String getType(){
		return this.type;
	}
}