package Curso;

import javax.swing.*;
import java.util.Scanner;

public class EstanqueGasolina {

    public static void main(String[] args) {

        int litros;
        String mensaje;

        litros= Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa los litros actuales de la gasolina en un rango de 1 a 70","Entrada de datos",JOptionPane.QUESTION_MESSAGE));

        mensaje= (litros==70)? "Estanque lleno":
                (litros>=60 && litros<70)?"Estanque casi lleno":
                (litros>=40 && litros<60)?"Estanque 3/4":
                (litros >= 35 && litros<40 )?"Medio Estanque":
                (litros>=20 && litros <35)?"Suficiente":
                (litros>=1 && litros<20)?"Insuficiente":"Error debes ingresar un numero entre 1 y 70";
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
