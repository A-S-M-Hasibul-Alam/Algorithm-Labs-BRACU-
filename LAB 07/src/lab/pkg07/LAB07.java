/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg07;

import java.util.Scanner;

/**
 *
 * @author TS
 */
public class LAB07 {
      static  int benifits[];
      static  int weight[];
      static int knpSz;
      static  int value[][];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        benifits=new int[sc.nextInt()+1];
        weight=new int[benifits.length];
       knpSz=sc.nextInt()+1;
        value=new int[benifits.length+1][knpSz];
       
       for(int i=1;i<benifits.length;i++){
       weight[i]=sc.nextInt();
       benifits[i]=sc.nextInt();
       
       }
       
       KnapSack();
       
       print();
       
       item();
    }
    public static void KnapSack(){
        for(int i=1;i<benifits.length;i++){
        for(int w=0;w<knpSz;w++){
            if(weight[i]<=w){
            if(benifits[i]+value[i-1][w-weight[i]]>value[i-1][w]){
                value[i][w]=benifits[i]+value[i-1][w-weight[i]];
            }
            else{
            value[i][w]=value[i-1][w];
            }
            }
            else{
                    value[i][w]=value[i-1][w];
                    }
            }
        }
        
        }
    
        public static void print(){
        for(int i=0;i<benifits.length;i++){
        for(int j=0;j<knpSz;j++)   {
            System.out.print(value[i][j]);
        }
        System.out.println();
                    }
        }
        public static void item(){
            String ans="";
        int i=benifits.length-1;
        int k=knpSz-1;
        while(i>0 && k>0){
            if(value[i][k]!=value[i-1][k]){
            ans=ans+i+"th item in the knapSack: "+value[i][k]+"\n";
            i=i-1;
            k=k-weight[i];
            }
            else{
                i=i-1;
            }
        }
        System.out.println(ans);
        }
        
    }