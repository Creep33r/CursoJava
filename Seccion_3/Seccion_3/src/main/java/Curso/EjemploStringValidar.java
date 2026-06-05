package Curso;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso= null;

        boolean esNulo = curso== null;

        System.out.println("esNulo = "+esNulo);

        if(esNulo){
            curso="Programacion java";

        }

        boolean esVacio = curso.length()==0;
        System.out.println("Es vacio = "+esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("Es vacio2 = "+esVacio2);

        //Esta es la mejor forma de validar
        boolean esBlanco= curso.isBlank();
        System.out.println("Es blanco = "+esBlanco);

        if(esBlanco==false){

            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

    }
}
