public class PruebaArrays{
	public static void main(String[] args){
		int[][][] intArray = new int[][][]{ { {0, 1, 2, 3} , {4, 5, 6}, {7, 8, 9} }, null };
		Object obj = intArray;
		Object intArray2 = new int[][][]{ { {0, 1, 2, 3} , {4, 5, 6}, {7, 8, 9} }, null };
		System.out.println(intArray2.length);
		System.out.println(intArray.length);
		System.out.println(obj.length);
	}
} 