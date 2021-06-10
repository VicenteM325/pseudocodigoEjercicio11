import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){
        int numero1, mayor = 0, c = 0, a = 0, b = 0, suma1 = 0;
        double promediopar;
        Scanner entrada = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.print("Ingrese un número entre [0, 36]: ");
            numero1 = entrada.nextInt();
            if(numero1 >= 1 && numero1 <= 36){
                if(numero1 % 2 == 0 && numero1 != 0){
                    c = c + 1;
                    suma1 = suma1 + numero1;
                } else {
                    a = a + 1;
                }
                if(numero1 >= 13 && numero1 <= 24){
                    b = b + 1;
                }
                if (numero1 > mayor){
                    mayor = numero1;
                } 
            } else{
                System.out.println("Numero ingresado incorrecto.");
                System.exit(0);
            }
        }
        promediopar = suma1/c;
        System.out.println("A) La cantidad de números impares es= " + a);
        System.out.println("B) El promedio de los números pares sin contar los ceros = " + promediopar);
        System.out.println("C) Cantidad de números que se encuentran en la segunda docena = " + b);
        System.out.println("D) El número mayor es = " + mayor);
        System.out.println("E) La cantidad de los números impares aumentaría así como también el promedio de los pares. ");
    }
}