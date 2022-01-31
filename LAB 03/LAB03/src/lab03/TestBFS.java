package lab03;






import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestBFS {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fReader = new FileReader("D:\\Programming\\221\\LAB 03\\LAB03\\src\\lab03\\input.txt");

		int[][] adjMat = fReader.getAdjacencyMatrix();

		int v= fReader.getVertex();

		ArrayList<Node> graph = new ArrayList<Node>();

		for(int i=0; i< v; i++) {
			Node n = new Node();
			graph.add(n);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a node to start (from 0 - )"+v);
		int sourceNode = sc.nextInt();

		Queue<Integer> myQueue = new LinkedList<Integer>();
		myQueue.add(sourceNode);
		Node s = graph.get(sourceNode);
		s.vigitedOrExplored = 1;

		while(!myQueue.isEmpty()) {
			int currentNode = myQueue.poll();

			Node n = graph.get(currentNode);

			for(int j=0; j< v; j++) {
				if(adjMat[currentNode][j] == 1) {
					Node nextNode = graph.get(j);
				//	System.out.println(j);
					if(nextNode.vigitedOrExplored == 0) {
						nextNode.distance = n.distance + 1;
						nextNode.vigitedOrExplored = 1;
						nextNode.path.add(currentNode);
						myQueue.add(j);
					}
				}
			}
			
			n.vigitedOrExplored = 2;
		}

		for(int i=0; i< v; i++) {
			Node n = graph.get(i);
			System.out.println("Node = "+i+" Distance = " +n.distance+" Vigited = "+n.vigitedOrExplored + " Path = " + n.path);
		}
    }
}
