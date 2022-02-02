/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PilaColaBolsa;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author WINDOWS 11
 */
public class RPN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Double> pila = new Stack<>(10);
        
        while(!StdIn.isEmpty()){
                
            String s = StdIn.readString();
            if(s.equals("+")){
                pila.push(pila.pop()+pila.pop());
            }
            else if(s.equals("*")){
                pila.push(pila.pop()*pila.pop());
            }
            else if(s.equals("/")){
                pila.push(1.0/pila.pop()*pila.pop());
            }
            else{
                double x = Double.parseDouble(s);
                pila.push(x);
            }
        }
        StdOut.println("Resultado: "+pila.pop());
    }
    
}
