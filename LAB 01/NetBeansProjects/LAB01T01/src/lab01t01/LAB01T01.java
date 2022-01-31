/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01t01;
import java.util.Stack;

/**
 *
 * @author 18101273
 */
public class LAB01T01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Stack <Integer> s = new Stack<Integer>();
    s.push(10);
    System.out.println(s.peek());
    s.push(5);
    System.out.println(s.peek());
    s.push(6);
    System.out.println(s.peek());
    s.pop();
    System.out.println(s.peek());
    s.push(9);
    System.out.println(s.peek());
    s.push(3);
    System.out.println(s.peek());
    s.push(2);
    System.out.println(s.peek());
    s.pop();
    System.out.println(s.peek());
    s.pop();
    System.out.println(s.peek());
    } 
}
