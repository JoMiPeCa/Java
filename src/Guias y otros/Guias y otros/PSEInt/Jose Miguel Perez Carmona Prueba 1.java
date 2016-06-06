import Leer;

2.- 

private int beca=0,promedio=0,edad=0;

do{
	System.out.println("Ingrese su edad: ");
	edad = Leer.datoInt();
	}while(edad<0);

do{
	System.out.println("Ingrese su Promedio: ");
	promedio = Leer.datoInt();
	}while(promedio<10 && promedio>70);

if(edad>18) {
	if(promedio>=65) {
		beca= 2000000;
		System.out.println("Felicidades! Tu beca es de: "+beca);
	} else if (promedio>=60 && promedio<65){
		beca = 1000000;
		System.out.println("Felicidades! Tu beca es de: "+beca);
	} else if (promedio>=55 && promedio<60){
		beca = 500000;
		System.out.println("Felicidades! Tu beca es de: "+beca);
	} else {
		System.out.println("Debes estudiar mas el proximo ciclo para acceder a becas!!!");
	}	
} else{
	if(promedio>=65) {
		beca= 300000;
		System.out.println("Felicidades! Tu beca es de: "+beca);
	} else if (promedio>=60 && promedio<65){
		beca = 200000;
		System.out.println("Felicidades! Tu beca es de: "+beca);
	} else if (promedio>=55 && promedio<60){
		beca = 100000;
		System.out.println("Felicidades! Tu beca es de: "+beca);
	} else {
		System.out.println("Debes estudiar mas el proximo ciclo para acceder a becas!!!");
	}	
}

4.-

private int tope=0,aux=0,aux2=1,aux3=0,cont=1;


do{
	System.out.println("Ingrese tope: ");
	tope = Leer.datoInt();
	}while(tope>1);

System.out.println("0");
	
Repetir{ 
	System.out.println(""+aux2);
	aux3=aux+aux2;
	aux = aux2;
	aux2 = aux3;
	cont=cont+1;	
}Hasta que (cont==tope);


5.- 

//Definido previamente arregloA y arregloB de largo N.
N = arregloA.size();
aux = arregloB.size();
if(N>aux){
	largo=N;
}else{
	largo=aux;
}

int[] = arregloC[largo];

for(int i=0;i<N;i++){
	arregloC[i]=arregloA[i]+arregloB[i];
	System.out.println("Arreglo C "+arregloC[i]);
}

6.-
Realice el pseudocodigo, que permita representar el funcionamiento de una maquina que 
recarga tarjetas bip. Sabiendo que se tienen las siguientes opciones para realizar la 
recarga: $1.000, $2.000,  $5.000 y $10.000. El usuario puede ingresar billetes de 
$1.000, $2.000, $10.000 y $20.000. La maquina debe ser capaz de dar vuelto. 
(Utilice estructura de repeticion Mientras).

private boolean condicion=true;
private int vuelto=0,billeteEntregado=0,carga=0,suma=0;

System.out.println("Ingrese cantidad de recarga: ");
System.out.println("1000");
System.out.println("2000");
System.out.println("5000");
System.out.println("10000");
System.out.println("");
System.out.println("");
System.out.println("");
carga = Leer.datoInt();


Mientras(condicion){
	do{
	System.out.println("Ingrese billete: ");
	billeteEntregado = Leer.datoInt();
	}while(billeteEntregado!=5000);//Si ingresa billete de 5000 el usuario perdio el dinero!!
	if(billeteEntregado>carga){
		vuelto= vuelto+billeteEntregado-carga;
		do{
		vuelto=vuelto-1000;
		System.out.println("Retire el billete: ");
		}while(vuelto!=0);
	}else if(billeteEntregado<carga){
		vuelto = vuelto + billeteEntregado;
		do{
			System.out.println("Ingrese billete: ");
			billeteEntregado = Leer.datoInt();
			
			vuelto = vuelto + billeteEntregado;
		}while(vuelto <carga);
		if(vuelto==carga){
			vuelto = 0;
		}else{
			do{
				vuelto=vuelto-1000;
				System.out.println("Retire el billete: ");
			}while(vuelto!=0);
			vuelto = 0;
		}
	}else{
		vuelto=0;
	}
	if(vuelto==0){
		condicion=false;
		System.out.println("Gracias por operar con nosotros!");
	}
}

7.
private int largo;
private int[] arregloA;
System.out.println("Ingrese tamaño del arreglo");
largo = Leer.datoInt();

arregloA= new int[largo-1];

for(int i=1;i<largo-1;i++){
	if(arregloA[0]>arregloA[i]){
		System.out.println("El numero en la primera posicion es MAYOR al de "+i);
	}else if(arregloA[0]<arregloA[i]){
		System.out.println("El numero en la primera posicion es MENOR al de "+i);
	}
	else{
		System.out.println("El numero en la primera posicion es Igual al de la posicion: "+i));
	}
}

<-------------------------- Archivo con la prueba!!!!!