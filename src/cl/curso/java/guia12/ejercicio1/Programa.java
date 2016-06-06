package cl.curso.java.guia12.ejercicio1;

import java.util.ArrayList;

public class Programa {
	
public static void main(String[] args) {
	
	Producto p1 = new Producto(1, "mayo", 300);
	Producto p2 = new Producto(2, "papa", 100);
	Producto p3 = new Producto(3, "vino en bolsa", 500);
	
	ArrayList<Producto> a1 = new ArrayList<Producto>();
	a1.add(p1);
	a1.add(p2);
	
	Usuario u1 = new Usuario("pepito", "123o");
	CarroCompras c1 = new CarroCompras(u1, a1);
	
	c1.imprimir();
	System.out.println(" ");
	c1.ordenarPorPrecio();
	c1.imprimir();
	
}

}
