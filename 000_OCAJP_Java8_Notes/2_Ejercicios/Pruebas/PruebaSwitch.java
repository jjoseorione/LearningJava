/*
	Con 0:
		i es 0
	Con 1:
		i es 1
	Con 2:
		i es 2
	Default:
		i es 5
*/

public class PruebaSwitch{
	public static void main(String[] args){
		int i = 0;
		switch(args[0]){
			default :
				i = i + 3;
			case "2" :
				i = i + 2;
			case "0" :
				break;
			case "1" :
				i = i + 1;
		}

		System.out.println("i es " + i);
	}
}