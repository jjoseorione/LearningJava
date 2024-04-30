import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PruebaExpresionLambda{
	public static void main(String... args){
		List<String> names = Arrays.asList(new String[]{"alex", "bob", "casy", "abel"});
		for(String n : names){
			Predicate<String> p = k -> {
				System.out.println(n);
				return k.startsWith("a");
			};
			if(p.test(n))
				System.out.println(n);
		}
	}
}