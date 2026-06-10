package Curso;

import java.util.Scanner;

public class NotasFinales {
    public static void main(String[] args) {
        double calificacion=0;
        int contador_mayores_A_Cinco =0;
        double suma_Mayores_A_Cinco = 0;
        double promedio_mayores=0;
        int contador_menores_A_Cuatro=0;
        double  suma_Menores_A_Cuatro = 0;
        double promedio_menores=0;
        double sumaTotal=0;
        double promedioGeneral=0;
        int notasTotales=0;
        int notasIgualAUno=0;

        Scanner leer = new Scanner(System.in);

        for (int i=0;i<20;i++){
            System.out.println("Ingresa la calificacion en una escala de 1-7");
            calificacion=leer.nextDouble();
            if (calificacion>=1.0 && calificacion<=7.0 ) {


                if (calificacion >= 5.0) {

                    contador_mayores_A_Cinco++;
                    suma_Mayores_A_Cinco += calificacion;

                }
                if (calificacion >1.0 && calificacion<= 4.0) {
                    contador_menores_A_Cuatro++;
                    suma_Menores_A_Cuatro += calificacion;

                }
                if(calificacion == 1.0){
                    notasIgualAUno++;
                }
                sumaTotal+=calificacion;
                notasTotales++;

            }else if(calificacion==0){
                System.out.println("Error");
                return;
            }else {
                System.out.println("Error ingresa la calificacion en una escala de 1-7");
                i--;
            }

        }
        if (contador_mayores_A_Cinco>0) {
            promedio_mayores=suma_Mayores_A_Cinco/contador_mayores_A_Cinco;
        }
        if (contador_menores_A_Cuatro>0) {
            promedio_menores=suma_Menores_A_Cuatro/contador_menores_A_Cuatro;
        }
        promedioGeneral= sumaTotal/notasTotales;

        System.out.println("Total nota mayores: "+contador_mayores_A_Cinco+"\nPromedio mayores: "+promedio_mayores);
        System.out.println("Total de notas mayor a 1 y menores o igual a 4: "+contador_menores_A_Cuatro+"\nPromedio menores: "+promedio_menores);
        System.out.println("Total notas 1: "+notasIgualAUno);
        System.out.println("Promedio General:  "+promedioGeneral);
    }
}
