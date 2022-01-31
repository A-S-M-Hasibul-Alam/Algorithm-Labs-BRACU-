/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08;

/**
 *
 * @author Hasib
 */
import java.util.Scanner;

public class Task1 {
	static Scanner ps = new Scanner(System.in);
	static int capacity = 10;
	static int n = 5;
	static int[] weight = new int [] {1,2,3,2,1} ;
	static int[] value = new int [] {100,120,200,150,170} ;
	static int [][] dp = new int [n][capacity];
	
	
	

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int knapsack(int i, int w) {
		int prof1, prof2;
		if (i >= n) {
			return 0;
		}
		if (dp [i][w] != -1) {
			return dp [i][w] ;
		}
		if (w + weight [i] <= capacity) {
			prof1 = knapsack (i + 1, w + weight [i]) + value [i] ;
		}
		else {
			prof1 = 0 ;
		}
		prof2 = knapsack (i + 1, w) ;
		return dp [i][w] = max (prof1, prof2) ;
	}

	public static void main(String[] args) {
		for (int i = 0 ; i < n ; i ++) {
			for (int j = 0 ; j < capacity; j ++) {
				dp [i][j] = -1 ;
			}
		}
		
		System.out.println(knapsack (0, 0)) ;
	}
}