package cl.curso.java.control_cinco.jperez.ejercicio2;

import java.util.Comparator;


/**
 * @author jose Perez Carmona
 *
 */
public class ComparadorPorDepartamento implements Comparator<Empleado> {
	@Override
    public int compare(Empleado o1, Empleado o2) {
		return (o1.getDepartamento().getNombre().compareToIgnoreCase(o2.getDepartamento().getNombre()));
    }
}
