/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exs;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author WINDOWS 11
 */
public class Punto2DCartesiano implements Punto2D {
    

	// Representacion del ADT
	private double x;
	private double y;
	
	// Constructores
	public Punto2DCartesiano() {}	// Crea el punto (0,0)
	
	public Punto2DCartesiano(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// API del ADT
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distancia(Punto2D p) {
		return Math.sqrt( (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY()) );
	}
	
	
	// Metodos heredados de Object
	
	/**
	 * Obtener una representacion textual del objeto
	 * @see java.lang.Object#toString()
	 *
	 * @return
	 */
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
	
	/**
	 * Determinar igualdad con otros objetos
	 * @see java.lang.Object#equals(java.lang.Object)
	 *
	 * @param a		Objecto con respecto al cual se compara
	 * @return
	 */
	public boolean equals(Object a) {
		if (a==null) return false;
		if ( !(a instanceof Punto2D) ) return false;
		Punto2D px = (Punto2D) a;
		if (this.distancia(px) < TOL) return true;
		return false;
	}
	
        public static final double TOL = 1E-12;
	
	// Pruebas unitarias de la implementacion
	public static void main(String[] args) {

		// Crear algunos puntos
		Punto2D a = new Punto2DCartesiano(1,2);
		Punto2D b = new Punto2DCartesiano(1,3);
		Punto2D c = new Punto2DCartesiano(3,4);
		assert(a.distancia(b)==1);
                assert(!a.equals(b));
                assert(!a.equals(null));
                
		// Verificar el toString
		StdOut.println(a);
		StdOut.println(b);
		StdOut.println(c);
		
		// Calcular su distancia al origen
		StdOut.println("Distancia de a al origen debe ser cero: "+a.distancia(a));
		StdOut.println("Distancia de b al origen debe ser sqrt(2): "+b.distancia(a));
		StdOut.println("Distancia de c al origen debe ser 5: "+c.distancia(a));
		
		// Chequeo de la igualdad de puntos
		StdOut.println("Un punto igual a si mismo: "+a.equals(a));
		StdOut.println("Un punto igual a otro punto: "+a.equals(b));
		StdOut.println("Un punto igual null: "+a.equals(null));
		StdOut.println("Un punto igual a otro objeto: "+a.equals(""));
		
		
		
	}

    
}
