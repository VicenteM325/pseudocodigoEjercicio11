Algoritmo Ejercicio11
	Para i <- 1 Hasta 10 Con Paso 1 Hacer
		Escribir "Ingresa un n�mero entre [0,36]: "
		Leer numero1
		Si numero1 >= 0 & numero1 <= 36 Entonces
			Si numero1 mod 2 == 0 & numero1 <> 0 Entonces
				c <- c+1 
				suma1 = suma1 + numero1
			SiNo
				a <- a+1
			Fin Si
			Si numero1 >= 13 & numero1 <= 24 Entonces
				b <- b+1
			FinSi
			Si numero1 > mayor Entonces
				mayor <- numero1
			FinSi
		SiNo
			Escribir "N�mero no valido."
		Fin Si
		i <- i+1
	Fin Para
	promediopar = suma1/c
	Escribir "A) La cantidad de n�meros impares es: " a 
	Escribir "B) El promedio de los n�meros pares sin contar los ceros: " promediopar
	Escribir "C) Cantidad de n�meros que se encuentran en la segunda docena: " b
	Escribir "D) El n�mero m�s grande: " mayor
	Escribir "E) La cantidad de los n�meros impares aumentar�a, as� como tambi�n el promedio de los pares." 
FinAlgoritmo
