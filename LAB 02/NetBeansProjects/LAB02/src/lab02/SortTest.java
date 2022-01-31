package lab02;

import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fReader = new FileReader("src//lab02//input.txt");
		
		int[] intArray = fReader.getArrayInt();
		
                
		System.out.println(Arrays.toString(intArray));
                
                MyArray a = new MyArray(intArray);
                System.out.println(Arrays.toString(a.InsertionSort(intArray)));
                System.out.println(Arrays.toString(a.merge(intArray, 0, intArray.length-1)));
	}
}
