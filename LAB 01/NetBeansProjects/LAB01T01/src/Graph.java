
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18101273
 */
public class Graph {
     public static void main(String args[]) throws IOException{
                File f = new File("D:\\Programming\\221\\LAB 01\\NetBeansProjects\\LAB01T01\\input.txt");
                  //BufferedReader bf = new BufferedReader(new FileReader(f));
                 // String st = bf.readLine();
                Scanner sc = new Scanner(f);
                int v = sc.nextInt();
                   int [][] UndirectedGraph= new int[v][v];
                   int [][] DirectedGraph= new int[v][v];
                   while(sc.hasNext()){
                       int v1 = sc.nextInt();
                       int v2 = sc.nextInt();
                       UndirectedGraph[v1][v2] = 1;
                       UndirectedGraph[v2][v1] = 1;
                       DirectedGraph[v1][v2] = 1;
                   }
                   //undirected graph
                   System.out.println("Undirected Graph");
                   System.out.println("Adjacency Matrix");
                    for(int i = 0; i<v; i++){
                        for( int j = 0; j<v; j++){
                            System.out.print(UndirectedGraph[i][j]+" ");
                                                }
                    System.out.println();
                    }
                    int count [] = new int[6];
                    System.out.println("Adjacency List");
                    for(int i=0; i<v; i++){
                        System.out.print(i+" -----> ");
                        for(int j = 0; j<v; j++){
                            
                            if(UndirectedGraph[i][j] == 1){
                                System.out.print(j+" ");
                                count[i]++; 
                            }
                            //System.out.println();
                            }
                        System.out.println();
                        }
                    System.out.println("Out Degree");
                    for(int i=0;i<v; i++){
                        int c = 0;
                        System.out.print(i+"-->");
                        for (int j=0; j<v; j++){
                            if(UndirectedGraph[i][j]==1){
                                c++;
                            }
                        }
                        System.out.println(c);
                    }
                    System.out.println();
                    
                   //Directed Graph
                   System.out.println("Directed Graph");
                   System.out.println("Adjacency Matrix");
                    for(int i = 0; i<v; i++){
                        for( int j = 0; j<v; j++){
                            System.out.print(DirectedGraph[i][j]+" ");
                                                }
                    System.out.println();
                    }
                    System.out.println("Adjacency List");
                    for(int i=0; i<v; i++){
                        System.out.print(i+" -----> ");
                        for(int j = 0; j<v; j++){
                            
                            if(DirectedGraph[i][j] == 1){
                                System.out.print(j+" ");
                            }
                            //System.out.println();
                            }
                        System.out.println();
                        }
                    System.out.println("Out/In Degree");
                    for(int i=0; i<v; i++){
                        int c1 = 0;
                        int c2=0;
                        System.out.print(i+"-->");
                        for(int j=0; j<v; j++){
                            if(DirectedGraph[i][j]==1){
                                c1++;
                            }
                            if(DirectedGraph[j][i]==1){
                                c2++;
                            }
                        }
                        System.out.println(c1+"/"+c2);
                    }
                    System.out.println();
                    
}
}
