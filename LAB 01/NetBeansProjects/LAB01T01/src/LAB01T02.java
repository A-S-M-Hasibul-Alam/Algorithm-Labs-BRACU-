        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */

        /**
         *
         * @author 18101273
         */
        import java.io.*;
        public class LAB01T02 {
            public static void main(String args[]) throws IOException{
                File f = new File("D:\\Programming\\221\\LAB 01\\NetBeansProjects\\LAB01T01\\input.txt");
                    BufferedReader bf = new BufferedReader(new FileReader(f));
                    String st; 
      while ((st = bf.readLine()) != null) 
        System.out.println(st); 
                }
            }
