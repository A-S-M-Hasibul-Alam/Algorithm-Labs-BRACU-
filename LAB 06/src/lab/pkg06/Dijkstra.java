/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg06;

/**
 *
 * @author Hasib
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Dijkstra {

	
	
	
	int[][] a;
	int[] parent;
	int[] key;
	int[] d;
	int count = 0;
	Queue<Integer> q = new LinkedList<Integer>();
	Queue<Integer> s = new LinkedList<Integer>();

	public void dijkster(int[][] g, int s) {
		a = new int[g.length][g.length];
		key = new int[g.length];
		parent = new int[g.length];
		d = new int[g.length];
		for (int i = 0; i < g.length; ++i) {
			parent[i] = -1;
			d[i] = 0;
			for (int j = 0; j < g.length; ++j) {
				a[i][j] = 1000000;
				key[i] = 1000000;
			}
		}
		a[s][s] = 0;
		key[s] = 0;
		for (int i = 1; i < g.length; ++i) {
			q.add(i);
		}
		while (q.size() != 0) {
			int u = extractmin();
			++count;
			for (int j = 1; j < g.length; ++j) {
				if (q.contains(j) && g[u][j] < key[j] && g[u][j] != 0) {
					parent[j] = u;
					key[j] = g[u][j];
					d[j] = d[u] + key[j];
					a[u][j] = g[u][j];
				}
			}

		}
	}

	public int extractmin() {
		int min = 10000;
		int index = -1;
		for (int i = 1; i < a.length; ++i) {
			if (key[i] < min && q.contains(i)) {
				index = i;
				min = key[i];
			}
		}
		q.remove(index);
		s.add(index);
		return index;
	}

	public void print(String[] ss) {
		while (s.size() != 0) {
			System.out.print(ss[s.remove()] + " ");
		}
		System.out.println();
		for (int i = 2; i < key.length; ++i) {
			System.out.println(ss[parent[i]] + " to " + ss[i] + " " + d[i] + " ");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Dijkstra d = new Dijkstra();
		
		
		File fr = new File("D:\\Programming\\221\\LAB 06\\src\\lab\\pkg06\\input.txt");
		String[] ss = { null, "Motijheel", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "Moughbazar" };
		
		BufferedReader br = new BufferedReader(new FileReader(fr));
		String st = br.readLine();
		
		int num = Integer.parseInt(st);
		num = num + 1;
		int[][] aList = new int[num][num];

		while ((st = br.readLine()) != null) {
			int i = 0;
			int[] a = new int[3];
			StringTokenizer s = new StringTokenizer(st, " ");
			while (s.hasMoreTokens()) {
				a[i] = Integer.parseInt(s.nextToken());
				++i;
			}
			aList[a[0]][a[1]] = a[2];
		}
		d.dijkster(aList, 1);
		d.print(ss);

	}
}
