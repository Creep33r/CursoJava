package Curso;

public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        i=0;
        boolean prueba= true;

        while (prueba) {

            if( i == 7){
                prueba= false;
            }
            System.out.println(i);
            i++;


        }
        prueba= false;
        while (prueba) {
            System.out.println("Nunca se ejecutara porque prueba esta como falsa");
        }



        do{
            System.out.println("Al menos se ejecuta una vez");

        }while(prueba);



        prueba= true;
        i=0;
        do {

            if (i==7){
                prueba= false;
            }

            System.out.println(i);
            i++;

        }while(prueba);
    }
}
