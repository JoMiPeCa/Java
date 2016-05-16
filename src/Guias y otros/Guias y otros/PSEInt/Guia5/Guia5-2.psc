Proceso Guia5
	Definir dias,area,total como entero;
	Definir ara como Caracter;
	
	Escribir "Ingrese el total de dias";
	Leer dias;
	Repetir 
		Escribir "Ingrese el Area (Otra => 4)";
		leer area;
	Hasta Que (area<5 && area>0)
	
	
	
	
	Segun area Hacer
		1:
			total=dias*150000;
		2:
			total=dias*120000;
		3:
			total=dias*200000;
		De Otro Modo:
			total=dias*80000;
	FinSegun
	Escribir "El total a pagar sera de: ",total;
FinProceso
