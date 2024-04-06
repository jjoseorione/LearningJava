public class PruebaFor4{
	public static void main(String[] args){
		int h = Integer.parseInt(args[0]);
		int x = 1;
		LOOP1 : do{
			LOOP2: for(int y=1; y<h; y++){
				if(y==x) continue;
				if(x*x + y*y == h*h){
					System.out.println("Found " + x + " " + y);
					break LOOP1;
				}
			}
			x++;
		}while(x<h);
	}
}