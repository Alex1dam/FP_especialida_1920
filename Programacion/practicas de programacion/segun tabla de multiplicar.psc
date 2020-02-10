Algoritmo sin_titulo
	Definir a,b,d como entero;
	Definir c como caracter;
	Escribir 'Escriba los numeros que desea calcular';
	Leer a,b;
	Escribir 'Escriba la operacion que desea multiplicar'
	Escribir 'suma';
	Escribir 'resta';
	Escribir 'multiplicacion';
	Escribir 'division';
	Leer c;
	Segun c Hacer
		'suma':
			d=a+b;
		'resta':
			d=a-b;
		'multiplicacion':
			d=a*b;
		'division':
			d=a/b;
		De Otro Modo:
			Escribir 'Operacion no reconocida';
	Fin Segun
	Escribir 'El resultado es ' d;
FinAlgoritmo
