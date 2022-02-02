/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaColaBolsa;

import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;


/**
 *
 * @author WINDOWS 11
 */
public class Stack<Item> implements Iterable<Item>{
    
    private Item[] pila;
    private int n; 
    
    public Stack(int max) {
        
        pila = (Item[])new Object[max];       
    }
    public void push(Item s) {
        pila[n++] = s;
    }
    public Item pop() {
        return pila[--n];
    }
    public boolean isEmpty() {
        return n==0;
    }
    public int size() {
        return n;
    }
    
    public static void main(String[] args){

      Stack pila = new Stack(5);
      
      pila.push("Mundo");
      pila.push("Tierra");
      pila.push("Casa");
      pila.push("Carro");
      
      StdOut.println(pila.isEmpty());
      StdOut.println(pila.isEmpty());

    }

    @Override
    public Iterator<Item> iterator(){
         
        return new IteradorPila();
    }
          
    class IteradorPila implements Iterator<Item> {

        int pos =n;
        
        @Override
        public boolean hasNext() {
            return pos>0;
        }

        @Override
        public Item next() {
            return pila[--pos];
        }
    
    
    }
   
}
