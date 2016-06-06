package cl.curso.java.guia12.ejercicio1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CarroCompras {
   private Usuario usuario;
   private List<Producto> productos;
   
   public CarroCompras(){}

/**
 * @param usuario
 * @param productos
 */
public CarroCompras(Usuario usuario, List<Producto> productos) {
	super();
	this.usuario = usuario;
	this.productos = productos;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public List<Producto> getProductos() {
	return productos;
}

public void setProductos(List<Producto> productos) {
	this.productos = productos;
}
   
   public void agregarProducto(Producto producto){
	   this.getProductos().add(producto);
   }
   
   public void eliminarProducto(Producto producto){
	   if(this.getProductos().contains(producto)){
	   this.getProductos().remove(producto);
	   }
	   else{
		   throw new ProductoNoEncontradoException("no existe el producto");
	   }
   }
   
   public void ordenarPorPrecio(){
	   
	   
	   Collections.sort(this.getProductos());
   }
   
   public void imprimir(){
	   for (int i = 0; i < this.getProductos().size(); i++) {
		System.out.println(this.getProductos().get(i));
	}
   }
   
}
