/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg04;

import java.util.Arrays;

/**
 *
 * @author Hasib
 */
public class DFS {
    public int time;
    public int [] [] adj;
    public String clr[];
    public int t [];
    public int pi [];
    public int V;
    public int Fi[];
    public int discovered[];
    public static int discoIter=0;
    public DFS(int a,int[] [] x){
    V=a;
    adj=x;
    }
    
    public void dfs(int g){
        clr = new String[V];
        pi=new int[V];
        t=new int[V];
        Fi=new int[V];
        discovered=new int[V-1];
        
        for(int i=0;i<V;i++){
            clr[i]="WHITE";
            //pi[i]=null;
        
        }
         time =0;
        
            for(int j=0;j<V;j++){
                if(adj[g][j]==1){
                    
            if(clr[g].equals("WHITE")){
                DFSVisit(adj,g);
            }
             
        }
        }
        
    }
    public void DFSVisit(int[] [] adj,int i){
        clr[i]="GRAY";
        discovered[discoIter]=i;
        discoIter++;
        time++;
        t[i]=time;
        for(int j=0;j<V;j++){
            if(adj[i][j]==1){
        if(clr[j].equals("WHITE")){
            pi[j]=i;
            DFSVisit(adj,j);
        }
            }
        }
        
        clr[i]="BLACK";
        time++;
        Fi[i]=time;
        
    }

    public void processed(){
    int srted []=new int[V];    
        System.arraycopy(Fi, 0, srted, 0, V);
    Arrays.sort(srted);
    String a="";
    for(int j=0;j<V;j++){
     for(int i=1;i<V;i++){
     if(srted[j]==Fi[i]){
     a=a+i+", ";
     }
    }
    }
    System.out.println("Processed Node :\n"+a);
    }
    
    
        public void visited(){
          String a ="";
    for(int i=0;i<discovered.length;i++){
    a=a+discovered[i]+", ";
    
    }
    
}
        public void DAG(){
    int srted []=new int[V];    
        System.arraycopy(Fi, 0, srted, 0, V);
    Arrays.sort(srted);
    String a="";
    String b="";
    for(int j=srted.length-1;j>0;j--){
     for(int i=1;i<V;i++){
     if(srted[j]==Fi[i]){
     a=a+i+", ";
     }
    }
     b=b+srted[j]+", ";
    }
    System.out.println("DAG :\n"+a+"\n"+b);
    }
}
