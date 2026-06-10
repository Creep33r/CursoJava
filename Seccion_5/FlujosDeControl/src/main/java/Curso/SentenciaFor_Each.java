package Curso;

public class SentenciaFor_Each {

    public static void main(String[] args) {

        int[] numeros ={1,3,5,7,9,11,13,15};

        for(int numero:numeros){
            System.out.println("num: "+ numero);
        }

        String[] nombres  = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Liz"};

        for(String nombre:nombres){

            System.out.println("nombre: "+ nombre);
        }




    }
}
