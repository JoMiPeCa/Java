Proceso Guia5
	Definir array como Real;
	Definir costoTotal,minimoPersonas,personas,total,km,precio como entero;
	Definir opcion Como Caracter;
	personas=0;
	precio=0;
	km=0;
	costoTotal=0;
	total=0;
	minimoPersonas = 20;
	
	Escribir "Ingrese cantidad de personas";
	Leer personas;
	Escribir "Ingrese distancia(KM)";
	Leer km;
	Escribir "Ingrese tipo del Autobus (A-B-C)";
	Leer opcion;
	opcion=Mayusculas(opcion);
	
	Si opcion=="A" Entonces
		precio=20;
		Si(personas <= minimoPersonas)Entonces				
			costoTotal = minimoPersonas * precio*km;
			Escribir "El costo total es: ",costoTotal;
			Escribir "Y por persona es: ",precio*km;
		Sino	
			costoTotal = personas * precio*km;
			Escribir "El costo total es: ",costoTotal;
			Escribir "Y por persona es: ",precio*km;
		FinSi
	Sino
		Si opcion=="B" Entonces
			precio=25;Si(personas <= minimoPersonas)Entonces				
				costoTotal = minimoPersonas * precio*km;
				Escribir "El costo total es: ",costoTotal;
				Escribir "Y por persona es: ",precio*km;
			Sino	
				costoTotal = personas * precio*km;
				Escribir "El costo total es: ",costoTotal;
				Escribir "Y por persona es: ",precio*km;
			FinSi
		Sino
			si opcion=="C" entonces
				precio=30;Si(personas <= minimoPersonas)Entonces				
					costoTotal = minimoPersonas * precio*km;
					Escribir "El costo total es: ",costoTotal;
					Escribir "Y por persona es: ",precio*km;
				Sino	
					costoTotal = personas * precio*km;
					Escribir "El costo total es: ",costoTotal;
					Escribir "Y por persona es: ",precio*km;
				FinSi
			Sino
				Escribir "ERROR 404";
			FinSi
		FinSi
	FinSi
FinProceso