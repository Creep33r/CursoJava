package Curso;

import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        boolean resultadoPositivo =true;
        int resultado = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        numero1 = leer.nextInt();
        System.out.println("Ingresa el numero");
        numero2 = leer.nextInt();

        if((numero1<0 && numero2>0)||(numero1>0 && numero2<0)){
            resultadoPositivo =false;
        }
        if(numero1<0){
            numero1=-numero1;
        }
        if(numero2<0){
            numero2=-numero2;
        }

        //La multiplicacion no es mas que una suma repetida
        //Hacemos un for,
        //i=0, mientras i<numero1; i incrementa en uno
        //mientras se incrementa, a resultado le sumamos el valor numero2
        //hasta que i<numero1
        //Ejemplo multiplicar 3*2:
        // int i=0;i<3;i++
        //resultado +=2;
        //a resultado se le sumara 2 hasta que i<3

        for (int i=0;i<numero1;i++){
            resultado +=numero2;
        }
        if (!resultadoPositivo){
            resultado =-resultado;
        }
        System.out.println(resultado);

    }


}
