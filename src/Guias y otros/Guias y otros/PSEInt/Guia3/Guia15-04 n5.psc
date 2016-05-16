Proceso sin_titulo
	Definir array,variable Como Caracter;
	Definir i Como Entero;
	Dimension array[6];
	//Para el caso que el usuario desee ingresar los elementos
	//	Para i<-0 Hasta 5 Hacer
	//	Escribir 'Elemento numero ',i+1;
	//	Leer array[i];
	//FinPara
	
	Para i<-0 Hasta 5 Hacer
		array[i]=ConvertirATexto(Azar(1001));
	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		variable=array[(5-i)];
		array[(5-i)]=array[i];
		array[i]=variable;
	FinPara
	
	Escribir 'Arreglo Ordenado: ',array[0],' ',array[1],' ',array[2],' ',array[3],' ',array[4],' ',array[5],' ';
FinProceso