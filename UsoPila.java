/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PilaColaBolsa;

import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

/**
 *
 * @author WINDOWS 11
 */
public class UsoPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<String> s1 = new Stack<>(10);
        s1.push("Hola");
        s1.push("Mundo");
        s1.push("Adios");
        
        Iterator<String> i = s1.iterator();
        while(i.hasNext()){
            String c = i.next();
            StdOut.println(c);
        }
//        Stack<Double> s2 = new Stack<>(10);
//        s2.push(Double.valueOf(5));
//        
//        String x = s1.pop();
//        Double y = s2.pop();
//        s2.push(3.4); //Autoboxing
//        
//        double d = s2.pop();//Autounboxing
//        
//        assert(s2.size()==10);
    }
    
}
