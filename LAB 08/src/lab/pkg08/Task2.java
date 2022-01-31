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

public class Task2 {
	static int[] weight = new int [] {1,2,3,2,1} ;
	static int[] value = new int [] {100,120,200,150,170} ;
	static int W = 50;
	static int n = value.length;
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	
	static int knapsack(int W, int n) {
		int i, j;
		int dp[][] = new int[n + 1][W + 1];

		
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= W; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				}
				else if (weight[i - 1] <= j) {
					dp[i][j] = max(value[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
				}
				else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[n][W];
	}

	
	public static void main(String args[]) {
		
		System.out.println(knapsack(W,n));
	}
}