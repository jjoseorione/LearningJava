public class PruebaFinallyBreak{
	public static void main(String args[]){
	  int i = 0;
	  loop :         // 1
	  {
		 System.out.println("Loop Lable line");
		 try{
			for (  ;  true ;  i++ ){
			   if( i >5) break loop;       // 2
			}
			//System.out.println("Unreachable?: YES");
			//Si se descomenta la línea anterior, el código no compila, a menos que se provea un camino
			//en el bloque for por medio del cual se pueda salir del bloque y ejecutarla. Por ejemplo, un
			//else break;
		 }
		 catch(Exception e){
			System.out.println("Exception in loop.");
		 }
		 finally{
			System.out.println("In Finally");      // 3
		 }
	  }
   }
}