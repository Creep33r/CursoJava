package Curso;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        int numAIngresar=0;
        int numero=0;
        int numMenor=0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingresa cuantos numeros vas a comparar");
            numAIngresar=leer.nextInt();
            if(numAIngresar<10){
                System.out.println("Debes ingresar al menos 10 numeros");
            }
        }while (numAIngresar<10);

            System.out.println("Ingresa el  numero");
            numMenor = leer.nextInt();

            for (int i = 1; i < numAIngresar; i++) {
                System.out.println("Ingresa el numero ");
                numero = leer.nextInt();
                if (numero < numMenor) {
                    numMenor = numero;
                }
            }
        System.out.println("El numero menor es: "+numMenor);
        if(numMenor<10){
            System.out.println("El numero menor es menor a 10");
        }else {
            System.out.println("El numero menor es igual o mayor a 10");
        }
    }
}
