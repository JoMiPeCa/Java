Proceso Guia4
	Definir horas,total,tramo1,i,tramo2,tramo3,tramo4 como entero;
	total=0;
	tramo1=500;
	tramo2=400;
	tramo3=300;
	tramo4=200;
	Repetir
		Escribir "Ingrese el numero de horas ";
		Leer horas;
	Hasta Que horas>=1
	
	Para i<-1 Hasta horas Con Paso 1 Hacer
		Si(i<=2) Entonces
			total=total+tramo1;
		FinSi
		Si(i>2 && i<6) Entonces
			total=total+tramo2;
		FinSi
		Si(i>5 && i<11) Entonces
			total=total+tramo3;
		FinSi
		Si(i>11) Entonces
			total=total+tramo4;
		FinSi
	FinPara
	
	Escribir "El monto total es: $",total;
	
FinProceso
