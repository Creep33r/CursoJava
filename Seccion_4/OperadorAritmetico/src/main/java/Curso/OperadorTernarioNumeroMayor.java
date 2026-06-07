package Curso;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max=0;

        Scanner leerDatos=new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int numero=leerDatos.nextInt();

        System.out.println("Ingrese el numero 2");
        int numero2=leerDatos.nextInt();

        System.out.println("Ingrese el numero 3");
        int numero3=leerDatos.nextInt();

        System.out.println("Ingrese el numero 4");
        int numero4=leerDatos.nextInt();

        max=(numero>numero2)?numero:numero2;
        max=(max>numero3)?max:numero3;
        max=(max>numero4)?max:numero4;


        System.out.println("Numero 1: "+numero);
        System.out.println("Numero 2: "+numero2);
        System.out.println("Numero 3: "+numero3);
        System.out.println("Numero 4: "+numero4);

        System.out.println("El numero maximo es: "+max);
    }
}
