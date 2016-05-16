Proceso Guia4
	Definir citas,valor1,valor2,valor3,valor4,i,total Como Entero;
	total=0;
	citas=0;
	valor1=200000;
	valor2=150000;
	valor3=100000;
	valor4=50000;
	
	Escribir "Ingrese el numero de citas ";
	Leer citas;
	
	Para i<-1 Hasta citas Con Paso 1 Hacer
		Si(i<=3) Entonces
			total=total+valor1;
		FinSi
		Si(i>3 && i<6) Entonces
			total=total+valor2;
		FinSi
		Si(i>5 && i<9) Entonces
			total=total+valor3;
		FinSi
		Si(i>8) Entonces
			total=total+valor4;
		FinSi
	FinPara
	
	Escribir "El monto total del tratamiento es: $",total;
	
FinProceso
