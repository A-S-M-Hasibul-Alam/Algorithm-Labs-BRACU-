/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg09;

/**
 *
 * @author Hasib
 */


public class LAB09 {

	static int nodes = 6+1;
	static int edges = 8 ;
	static int[][] g = new int[nodes][nodes];
	

	static void graph(int row, int column, int val) {

		g[row][column] = val;

	}
	
	static void printGraph () {
		for (int row = 1 ; row < nodes ; row ++) {
			for (int column = 1 ; column < nodes ; column ++) {
				System.out.print (g [row][column] + "  ") ;
			}
			System.out.println () ;
		}
	} 
	
	public static void main (String[] args) {
		graph (1,2,3);
		graph (1,3,2);
		graph (1,6,105);
		graph (2,1,4);
		graph (2,5,90);
		graph (2,5,105);
		graph (3,4,90);
		graph (5,6,90);
		graph (6,2,-1);
		graph (6,4,1);
		
		printGraph () ;
	}
}
