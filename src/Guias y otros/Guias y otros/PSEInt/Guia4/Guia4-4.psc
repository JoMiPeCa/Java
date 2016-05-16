Proceso Guia4
	Definir opcion,aniosAntiguedad como entero;
	Definir sueldo,sueldoBono,sueldoAntiguedad como Real;
	Definir salir como logico;
	aniosAntiguedad=0;
	sueldo=0;
	opcion=0;
	sueldoAntiguedad=0;
	sueldoBono=0;
	salir=Falso;
	
	Escribir "Sistema de Bono de Empresa, El Sistema esta Cargando...";
	
	Repetir
		Esperar 3 Segundos;
		Borrar Pantalla;
		Escribir "";
		Escribir "Ingrese una opcion ";
		Escribir "";
		Escribir "1 Asignar Bono";
		Escribir "2 Salir";
		Leer opcion;
		
		Segun opcion Hacer
			
			1:
				Escribir "Ingrese años de antiguedad";
				Leer aniosAntiguedad;
				Escribir "Ingrese el Sueldo";
				Leer sueldo;
				Si (aniosAntiguedad>2 && aniosAntiguedad <5) entonces
					sueldoAntiguedad=sueldo*1.2;
				Sino
					si aniosAntiguedad >5 entonces
						sueldoAntiguedad=sueldo*1.3;
					Sino
						sueldoAntiguedad=sueldo;
					FinSi
				FinSi
				Si sueldo < 1000 Entonces
					sueldoBono=sueldo*1.25;
				Sino
					si (sueldo>1000 && sueldo<=3500) entonces
						sueldoBono = sueldo*1.15;
					Sino
						Si sueldo>3500 entonces
							sueldoBono=sueldo*1.10;
						FinSi
					FinSi
				FinSi
				Si (sueldoBono > sueldoAntiguedad) entonces
					Escribir "Sueldo total a cancelar: ",TRUNC(sueldoBono)," bonificacion por bono: ",TRUNC(sueldoBono-sueldo);
				Sino
					Escribir "Sueldo total a cancelar: ",TRUNC(sueldoAntiguedad)," bonificacion por Antiguedad: ",TRUNC(sueldoAntiguedad-sueldo);
				FinSi
				
			2:
				Escribir "El Sistema se esta cerrando";
				salir=Verdadero;
				Esperar 2 Segundos;
			De Otro Modo:
				Escribir "ERROR 404 NOT FOUND";
				
		FinSegun
	Hasta que (salir)
FinProceso
