/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exs;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author WINDOWS 11
 */
public interface Punto2D {
    
    double getX();

	/**
	 * 
	 * @return La coordenada Y del punto
	 */
    double getY();

	/**
	 * 
	 * @return La distancia euclideana entre 'this' y 'punto'
	 */
    double distancia(Punto2D punto);
}
