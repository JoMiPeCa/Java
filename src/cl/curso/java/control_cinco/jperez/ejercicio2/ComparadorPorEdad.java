package cl.curso.java.control_cinco.jperez.ejercicio2;

import java.util.Comparator;


/**
 * @author jose Perez Carmona
 *
 */
public class ComparadorPorEdad implements Comparator<Empleado> {
	@Override
    public int compare(Empleado o1, Empleado o2) {
		return (o1.getEdad() == (o2.getEdad()))?0:(o1.getEdad() > (o2.getEdad()))?1:-1;
    }
}
