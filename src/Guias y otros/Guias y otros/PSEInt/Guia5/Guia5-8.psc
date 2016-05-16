Proceso Guia5
	Definir total como Real;
	Definir peso,opcion Como Entero;
	//PE == PESO en gramos AKA peso
	//NZ == Zona AKA opcion
	//CO == Costo Total AKA total
	total=0.0;
	peso=0;
	opcion=0;	
	
	Repetir
		Escribir "Ingrese Peso del Paquete(en Gramos)";
		Leer peso;
	Hasta Que peso>0
	//Mayor 5KG NO
	
	SI peso>5000 entonces
		Escribir "NO SE DA EL SERVICIO (Peso mayor a 5000 gramos)";
		Escribir "El sistema finalizara automaticamente.";
	Sino
		Repetir 
			Escribir "Zonas de entregas ProfeFeliz";
			Escribir "";
			Escribir "1 America del Norte";
			Escribir "2 America Central";
			Escribir "3 America del Sur";
			Escribir "4 Europa";
			Escribir "5 Asia";
			Escribir "";
			Escribir "Para salir, ingrese 6";
			Escribir "";
			Escribir "Ingrese zona";
			Leer opcion;
			Segun opcion Hacer
				1:
					Escribir "America del Norte";
					//$11.00
					total=11.00*peso;
				2:
					Escribir "America Central";
					//$10.00
					total=10.00*peso;
				3:
					Escribir "America del Sur";
					//$12.00
					total=12.00*peso;
				4:
					Escribir "Europa";
					//$24.00
					total=24.00*peso;
				5:
					Escribir "Asia";
					//$27.00
					total=27.00*peso;
				6:
					Escribir "Usted escogio Salir. Hasta luego!";
				De Otro Modo:
					Escribir "Zona no Valida";
			FinSegun
			Si opcion ==1 || opcion ==2 || opcion ==3 || opcion ==4 || opcion ==5 Entonces
				Escribir "Costo total: ",total;
				Escribir "En unos momentos sera redirigido...";
				peso=0;
				Esperar 2 segundos;
				Limpiar Pantalla;
			FinSi
			Si peso==0 entonces
				Repetir
					Escribir "Ingrese Peso del Paquete(en Gramos)";
					Leer peso;
				Hasta Que peso>0
				SI peso>5000 entonces
					Escribir "NO SE DA EL SERVICIO (Peso mayor a 5000 gramos)";
					opcion=6;
					Escribir "El sistema se saldra automaticamente.";
				FinSi
			FinSi
		Hasta Que opcion=6
	FinSi
	
FinProceso