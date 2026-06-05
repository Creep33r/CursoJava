package Curso;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        String nombre1="";
        String nombre2="";
        String nombre3="";

        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe tu nombre ");
        nombre1 = leer.next();
        System.out.println("Escribe tu nombre ");
        nombre2 = leer.next();
        System.out.println("Escribe tu nombre ");
        nombre3 = leer.next();
        System.out.println(nombre1.toUpperCase().charAt(1)+"."+nombre1.substring(nombre1.length()-2));
        System.out.println(nombre2.toUpperCase().charAt(1)+"."+nombre2.substring(nombre2.length()-2));
        System.out.println(nombre3.toUpperCase().charAt(1)+"."+nombre3.substring(nombre3.length()-2));


    }
}
