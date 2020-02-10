algoritmo Primos
    a <- 1
    x<-1           
    Mientras a<27 Hacer
        b <- Verdadero 
        Para c<-3 hasta rc(x) con paso 2 Hacer 
            Si x MOD c = 0 entonces 
                b <- Falso 
            FinSi
        FinPara
        Si b Entonces
            a <- a + 1
            Escribir a, " ",x;
        FinSi
        x <- x + 2 
    FinMientras
FinAlgoritmo
