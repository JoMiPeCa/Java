package cl.curso.java.ejemplos.sistemaBip;

import java.util.Calendar;
import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 5, 15); 
		Date fechaExp = cal.getTime();
		Date hoy = new Date();

		System.out.println(  fechaExp );
		System.out.println(  hoy );
		System.out.println( hoy.after(fechaExp) );
		System.out.println( hoy.before(fechaExp) );
		
	}

}
