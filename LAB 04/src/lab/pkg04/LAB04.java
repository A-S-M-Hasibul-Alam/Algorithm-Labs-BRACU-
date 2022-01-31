/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg04;
 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Hasib
 */
public class LAB04 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
           File file = new File("D:\\Programming\\221\\LAB 04\\src\\lab\\pkg04\\inut");
          
           Scanner sc = new Scanner(file);
           int sz = sc.nextInt();
           int adj [][] = new int[sz] [sz];
           while(sc.hasNextInt()){
          adj[sc.nextInt()] [sc.nextInt()]=1;
           }
    
        DFS a = new DFS(sz,adj);
        a.dfs(1);
        int x=1;
        while(x<a.V){
            if(!a.clr[x].equals("BLACK")){
            a.dfs(x);
            }
            x++;
        }
       // a.processed();
        a.visited();
        a.processed();
        
        a.DAG();
}
}
