import javax.swing.JFrame;
import javax.swing.JLabel;

//Swing es una biblioteca gráfica de Java
//La clase JFrame crea una ventana. Se crea una clase hija para que 
//herede los métodos y atributos de JFrame
//La clase JLabel ayuda a mostrar un texto dentro de un JFrame

public class Formulario extends JFrame{
	private JLabel label1;
	public Formulario(String texto, int b1, int b2, int b3, int b4){
		setLayout(null);				//Indica posicionamiento absoluto
		label1 = new JLabel(texto);			//Se crea un label y se manda el texto a mostrar como parámetro
		label1.setBounds(b1, b2, b3, b4);	//Se posiciona y dimensiona el label dentro del frame
		add(label1);						//Se agrega el label al JFrame
	}

	public static void main(String[] args){
		Formulario f1 = new Formulario("Hola mundo", 10, 20, 200, 30);		//Se crea el Formulario
		f1.setBounds(70, 10, 400, 300);										//Se posiciona y dimensiona el frame
		f1.setVisible(true);												//Se hace visible el label
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					//Se indica que la aplicación termina al cerrar la ventana

		Formulario f2 = new Formulario("Adios mundo cruel", 30, 220, 200, 30);
		f2.setBounds(300, 200, 600, 500);
		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}