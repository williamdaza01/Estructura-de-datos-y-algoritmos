/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exs;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author WINDOWS 11
 */
public class Exs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*String s = "Hola";
        String t = StdIn.readString();
        
        StdOut.println(s.equals(t));*/
        
        Punto2D p1 = new Punto2DCartesiano(1,1);
        Punto2D p2 = new Punto2DPolar(Math.sqrt(2),Math.PI/4);
        
        StdOut.println(p1.equals(p2));
        StdOut.println(p1.distancia(p2));
        
        StdOut.println(p1.toString());
        StdOut.println(p2);

    }
    
}
