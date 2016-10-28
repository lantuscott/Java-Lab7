import java.util.Arrays;

public class ArrayPass
{

	public static void changeArray(int[] anArray)
	{
		// add code to change *elements* of anArray:
		//	anArray[0] = 47; for example
		anArray[0] = -13;
		anArray = new int[] {3,4,5};
		printArray1(anArray);
	}
	
	public static int[] copyArray(int[] bArray)
	{
		// create new array of same length as bArray,
		// copy bArray into new array, element by element
		// then return this new array
		
		int[] pumpkin = new int[bArray.length];
		for(int index=0; index < bArray.length; index++)
		{
			pumpkin[index] = bArray[index];
		}

		
		return pumpkin; 
	}
	
	// two ways of printing out elements of an array follow...
	
	public static void printArray1(int[] array)
	{
		for (int i=0; i < array.length; i++)
		{
			StdOut.printf("array[%d]==%d ", i, array[i]);
		}		
		StdOut.println();
	}
	
	public static void printArray2(int[] array)
	{
		StdOut.printf("array[0..%d]: ( ", array.length-1);
		for (int value: array)
			StdOut.printf("%d ",value);
		StdOut.println(")");
	}
	
	public static void printArray3(int[] array)
	{
		StdOut.println(Arrays.toString(array)); // look what I found!
	}
	
	public static void main(String[] args)
	{
		int[] array1 = {1, 2, 3}; // array initializer
		int[] array2 = new int[]{45, 46, 47, 48}; // newer array initializer
		
		int[] array3; // just declare the reference...
		array3 = new int[5];
		array3[0]=97;
		array3[1]=98;
		array3[2]=99;
		
//		printArray3(array1);
//		changeArray(array1);
//		printArray3(array1);
		
		printArray3(array3);
		int[] newArray;
		newArray = copyArray(array3);
		array3[0] = 2;
		printArray3(newArray);
		printArray3(array3);
		
//		printArray1(array1);
//		printArray2(array2);
//		printArray3(array3);
	}

}
