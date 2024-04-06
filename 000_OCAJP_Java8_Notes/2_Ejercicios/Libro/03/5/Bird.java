package animals; 

public class Bird{
	public static int numBirds;
	public float height, weight;
	public boolean exotic;
	public String name;
	public static double doble;
	public Bird b1 = new Bird();

	public void fly(){
		System.out.println("numBirds = " + numBirds);
		System.out.println("height = " + height);
		System.out.println("weight = " + weight);
		System.out.println("exotic = " + exotic);
		System.out.println("name = " + name);
		System.out.println("doble = " + doble);

	}
}