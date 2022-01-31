package lab03;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	private String filePath;
	private Scanner sc;
	int vertex;

	public int getVertex() {
		return vertex;
	}

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

	public int[][] getAdjacencyMatrix() {
		vertex = sc.nextInt();
		int[][] undirectedMat = new int [vertex][vertex];
		
		while(sc.hasNext()) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			undirectedMat[v1][v2] = 1;
			undirectedMat[v2][v1] = 1;
		}
		
		return undirectedMat;
	}
}
