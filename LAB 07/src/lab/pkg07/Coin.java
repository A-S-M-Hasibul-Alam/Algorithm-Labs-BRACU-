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
public class Coin {
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
        
       int sum=0;
       for(int i=1;i<benifits.length;i++){
       weight[i]=1;
       benifits[i]=sc.nextInt();
       sum=sum+benifits[i];
       }
       int mid = sum/2;
       knpSz=mid+1;
       value=new int[benifits.length+1][knpSz];
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
            String ans2="";
            int i=1;
        int k=1;
        int sum1=0;
        int sum2=0;
        while(k<knpSz){
            sum1=sum1+value[i][k];
            if(sum1/2<=knpSz){
            ans=ans+i+" ";
            i=i+1;
            k=k++;
            }
        
            else{
                sum2=sum2+value[i][k];
                ans2=ans2+i+" ";
                i++;
                k++;
            }
        }
        System.out.println(ans+" "+ans2+", difference: "+(sum1-sum2));
        }
}
        