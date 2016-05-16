Proceso Guia4
	Definir cont,i,tope,a,c,suma Como Entero;
	Escribir 'Ingrese un numero';
	Leer tope;
	tope <- tope-1;
	suma <- 0;
	cont <- 0;
	a <- 0;
	i <- 1;
	c <- 0;
	Escribir '0';
	Mientras cont<tope Hacer
		Escribir '',i;
		c <- a+i;
		a <- i;
		i <- c;
		cont <- cont+1;
	FinMientras
	// suma = suma +i
	// Escribir "El total es:",suma
FinProceso

