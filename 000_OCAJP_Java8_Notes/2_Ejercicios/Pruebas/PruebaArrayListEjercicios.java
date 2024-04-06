import java.util.ArrayList;

public class PruebaArrayListEjercicios{
	public static void main(String[] args){
		ArrayList<String> list1 = new ArrayList<>(), list2 = new ArrayList<>();
		switch(Integer.parseInt(args[0])){
			case 1:
				//list1.add("a").add("b");	//No compila
				System.out.println(list1);
				break;
			case 2:
				if( list1.add("a") ){
					if( list1.contains("a") ){
						list1.add(list1.indexOf("a"), "b");
					}
				}
				System.out.println(list1);	//[b, a]
				break;
			case 3:
				list1.add("a"); list1.add("b");
				list1.add(list1.size(), "x");
				System.out.println(list1);	//[a, b, x]
				break;
			case 4:
				list1.add("a"); list1.add("b");
				list2.add("b"); list2.add("c"); list2.add("d");
				//list1.add(list2);	//No compila, debe ser addAll
				list1.remove("b");
				System.out.println(list1);
				break;
			case 5:
				list1.add("a"); list1.add("b");
				list2.add("b");	list2.add("c"); list2.add("d");
				list1.addAll(list2);
				System.out.println(list1);	//abbcd
				list1.remove("b");
				System.out.println(list1);	//abcd
				break;
			case 6:
				list1.add("a"); list1.add("b");
				list2.add("b"); list2.add("c"); list2.add("d");
				list1.addAll(list2);
				//list1.removeAll("b");		//No compila
				System.out.println(list1);	
				break;
		}
	}
}