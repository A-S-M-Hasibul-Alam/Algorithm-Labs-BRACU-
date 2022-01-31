/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg05;

/**
 *
 * @author Hasib
 */
import java.io.*;
import java.util.*;
public class Tester{
  public static void main(String[]args) throws Exception{
    FileReader fr;
      fr = new FileReader(new File("D:\Programming\221\LAB 05\src\lab\pkg05\input.txt"));
    BufferedReader br = new BufferedReader(fr);
    
    String states = br.readLine();
    System.out.println("<<Printing the states>>");
    System.out.println(states);
    StringTokenizer st = new StringTokenizer(states," ");
    // count the number of tokens
    int tokens = st.countTokens();
    System.out.println("<<Printing the number of tokens>>");
    System.out.println(tokens);
    
    // creating an array with states as elements
    String [] a = new String[tokens];
    for(int i = 0;i<tokens;i++){
      String s = st.nextToken();
      a[i] = s;
    }
    // creating the matrix of the graph
    int [][] mat = new int[tokens][tokens];
    // populate the matrix
    for (int row = 0;row<tokens;row++){
      states = br.readLine();
      st = new StringTokenizer(states," ");
      for(int col = 0;col<tokens;col++){
        mat[row][col] = Integer.parseInt(st.nextToken());
      }
    }
    // print the matrix
    for (int row = 0;row<tokens;row++){
      for(int col = 0;col<tokens;col++){
         System.out.print(mat[row][col]+" ");
      }
      System.out.println();
    }
    PrimStudent p = new PrimStudent(mat,a);
    p.runPrim();

  }
}
