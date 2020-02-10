Algoritmo sin_titulo
	Definir a Como Entero;
	Escribir "Escriba un numero";
	Leer a;
	
	Definir option como Entero;
	option <- 0;
	si a <= 14 entonces
		option <- 1;
	sino 
		Si a<= 27  Entonces
			option <-2;
		SiNo
			Si a<=59 Entonces
				option<-3
			SiNo
				option<-4
			Fin Si
		Fin Si
	FinSi
	Segun option Hacer
		1:
			Escribir'Usted esta en la fase: Infancia';
		2:
		    Escribir'Usted esta en la fase: Joven';
		3:
			Escribir'Usted esta en la fase: Adulto';
		De Otro Modo:
			Escribir 'Usted esta en la fase: Mayor';	
	Fin Segun
FinAlgoritmo
