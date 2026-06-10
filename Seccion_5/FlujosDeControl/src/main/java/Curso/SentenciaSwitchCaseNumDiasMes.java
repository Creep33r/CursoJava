package Curso;

import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes de 1-12");
        int mes = leer.nextInt();
        int numDias = 0;
        System.out.println("Ingresa el año (YYYY)");
        int anio=leer.nextInt();

        switch(mes){
            case 1,3,5,7,8,10,12:
                numDias = 31;
                break;
            case 4,6,9,11:
                numDias = 30;
                break;
            case 2:
                if( anio%400==0 || ( ( anio%4 == 0 ) &&  !( anio%100==0 ) ) ) {
                    numDias=29;

                }else {
                    numDias=28;
                }
                break;
            default:
                numDias=0;
        }


        System.out.println("Numero de dias: "+numDias);
    }
}
