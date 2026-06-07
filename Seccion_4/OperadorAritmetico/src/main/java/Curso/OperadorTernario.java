package Curso;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Estructura
        //variable = (condicion) ? si es verdadero : si es falso;
        String variable = 7==7 ? "Si es verdadero":"Es falso";
        System.out.println(variable);

        String estado="";
        double promedio=0.0;

        double matematicas=0.0;
        double ciencias=0.0;
        double historia=0.0;

        Scanner leerDatos = new Scanner(System.in);

        System.out.println("Ingresa la calificacion de matematicas entre 0-100");
        matematicas= leerDatos.nextDouble();

        System.out.println("Ingresa la ciencias entre 0-100");
        ciencias = leerDatos.nextDouble();

        System.out.println("Ingresa el promedio entre 0-100");
        historia = leerDatos.nextDouble();

        promedio= (matematicas+ciencias+historia)/3;

        estado = promedio >= 70 ? "Aprobado":"Reprobaste";
        System.out.println(estado);

       /* if (promedio>=5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobaste");
        }*/


    }
}
