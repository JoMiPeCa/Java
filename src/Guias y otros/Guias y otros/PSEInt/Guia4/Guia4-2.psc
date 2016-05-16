Proceso Guia4
	Definir matPrima,clave Como Entero;
	Definir cProd,pVenta,mObra,gFab como Real;
	clave=0;
	//Costo Produccion = mat prima + mano de obra + gasto fab.
	//Precio venta= cost. prod + 45% cost. prod
	//Mano Obra = 3-4 0.75 matprima; 1-5 0.8 matprima; 2-6 .85 matprim
	Mientras clave>6||clave<1 Hacer
	Escribir "Ingrese clave del producto";
	Leer clave;
	FinMientras
	Escribir "Ingrese cantidad materia prima";
	Leer matPrima;
	Segun clave Hacer
		1:
			mObra=matPrima*0.8;
			gFab=matPrima*1.28;
		2:
			mObra=matPrima*0.85;
			gFab=matPrima*1.3;
		3:
			mObra=matPrima*0.75;
			gFab=matPrima*1.35;
		4:
			mObra=matPrima*0.75;
			gFab=matPrima*1.28;
		5:
			mObra=matPrima*0.8;
			gFab=matPrima*1.3;
		6:
			mObra=matPrima*0.85;
			gFab=matPrima*1.35;
		De Otro Modo:
			Escribir "ERROR 404 NOT FOUND ON THIS SERVER";
	FinSegun
	
	cProd=matPrima+mObra+gFab; //Costo Produccion
	pVenta=cProd*1.45;
	
	Escribir "Precio de venta es: $",pVenta;
	
FinProceso
