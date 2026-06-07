package Curso;

import javax.swing.*;

public class NumeroMayorOrdenado {
    public static void main(String[] args) {

        int num1, num2;
        String mensaje = "";


        num1= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer numero","Entrada de datos",JOptionPane.QUESTION_MESSAGE));

        num2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segundo numero","Entrada de datos",JOptionPane.QUESTION_MESSAGE));

        mensaje = (num1>num2) ?"Numeros ordenado del mayor al menor\n"+num1+"\n"+num2 :"Numeros ordenado del mayor al menor\n"+ num2+"\n"+num1;

        JOptionPane.showMessageDialog(null,mensaje);

    }
}
