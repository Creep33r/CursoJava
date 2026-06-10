package Curso;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes de 1-12");
        int mes = leer.nextInt();
        int numDias = 0;
        System.out.println("Ingresa el año (YYYY)");
        int anio=leer.nextInt();


        if(mes ==1 || mes==3||mes==5||mes==7||mes==8||mes==10){
            numDias=31;

        } else if(mes ==4||mes==6||mes==9||mes==11){
            numDias =30;

        } else if (mes==2) {

            if( anio%400==0 || ( ( anio%4 == 0 ) &&  !( anio%100==0 ) ) ) {
                numDias=29;

            }else {
                numDias=28;
            }
        }
        System.out.println("Numero de dias: "+numDias);
    }
}
