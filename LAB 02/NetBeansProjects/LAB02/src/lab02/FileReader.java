package lab02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	private String filePath;
	private Scanner sc;

	public FileReader(String filePath) throws FileNotFoundException {
		this.filePath = filePath;
		File f = new File(filePath);
		sc = new Scanner(f);
	}

	public int[] getArrayInt() {
		int[] array = new int [sc.nextInt()];

		int i=0;
		while(sc.hasNext()) {
			array[i] = sc.nextInt();
			i++;
		}

		return array;
	}
}
