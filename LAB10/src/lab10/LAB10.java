/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.Scanner;

/**
 *
 * @author TS
 */
public class LAB10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String m = sc.nextLine();
        System.out.println("Enter 2nd String");
        String n = sc.nextLine();
        
        lcs(m,n);
    }
    static void lcs (String x, String y){
        int xLength = x.length();
        int yLength = y.length();
        int [][] c = new int[xLength+1][yLength+1];
        char [][] d = new char [xLength+1][yLength+1];
        for (int i = 0;i<c.length; i++){
            c[i][0]=0;
            d[i][0]='0';
        }
        for (int i = 0;i<c[0].length; i++){
            c[0][i]=0;
            d[0][i]='0';
        }
        for (int i = 1;i<c.length; i++){
            for (int j = 1;j<c[0].length; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    c[i][j]=c[i-1][j-1]+1;
                    d[i][j]='C';
                }
                else {
                    if(c[i-1][j]> c[i][j-1]){
                        c[i][j]= c[i-1][j];
                        d[i][j]='L';
                    }
                    else {
                        c[i][j]= c[i][j-1];
                        d[i][j]='U';
                    }
                    
                }
            }
            
        }
    }
}