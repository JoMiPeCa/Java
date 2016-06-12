/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio1;

import java.util.Comparator;

/**
 * @author jose Perez Carmona
 *
 */
public class ComparadorPorTipo implements Comparator<Transaccion> {
	@Override
    public int compare(Transaccion o1, Transaccion o2) {
		return o1.getTipo().compareTo(o2.getTipo());
    }
}
