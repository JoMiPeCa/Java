Proceso transbank
	Definir opcion,saldo,retiro como entero;
	Definir salir como logico;
	saldo=13250;
	retiro=0;
	opcion=0;
	salir=Falso;
	
	Escribir "Bienvenido al Cajero Automatico Emplea, El Sistema esta Cargando...";
	
	Repetir
		Esperar 3 Segundos;
		Borrar Pantalla;
		Escribir "";
		Escribir "Ingrese una opcion ";
		Escribir "";
		Escribir "1 Retiro de dinero";
		Escribir "2 Consultar Saldo";
		Escribir "3 Conocer mi Clave";
		Escribir "4 Cambio de Clave";
		Escribir "5 Cambio Idioma";
		Escribir "6 Salir";
		Leer opcion;
		
		Segun opcion Hacer
			
			1:
				Escribir "Su saldo actual es: $",saldo," Pesos";
				Escribir "Retiro de Dinero";
				Si(saldo>0) entonces
					Escribir "Ingrese monto a retirar";
					Leer retiro;
					si(retiro<saldo) entonces
						saldo = saldo-retiro;
						Escribir "Retire su dinero";
					Sino
						Escribir "Saldo insuficiente";
						opcion=1;
					FinSi
					
				FinSi
				
			2:
				Escribir "Consultar Saldo";
				Escribir "Su saldo es de: $",saldo;
				
			3:
				Escribir "Su clave es: ";
				Escribir azar(10000);
				
			4:
				Escribir "Cambio Clave";
				Escribir "";
				Escribir "Por el momento no podemos procesar su solicitud.";
				Escribir "Regresando al menu";
				
			5:
				Escribir "Cambio Idioma";
				Escribir "";
				Escribir "Por el momento el unico idioma permitido es ESPAÑOL";
				Escribir "Regresando al menu";
				
			6:
				Escribir "Retirar Tarjeta por favor";
				salir=Verdadero;
				Esperar 2 Segundos;
			De Otro Modo:
				Escribir "ERROR 404 NOT FOUND";
				
		FinSegun
	Hasta que (salir)
FinProceso
