package Curso;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre1;
        String nombre2;
        String nombre3;
        int max;
        String mensaje;


        nombre1= JOptionPane.showInputDialog(null,"Ingresa un nombre:");
        nombre2= JOptionPane.showInputDialog(null,"Ingresa un nombre:");
        nombre3= JOptionPane.showInputDialog(null,"Ingresa un nombre:");

        String nom1[] = nombre1.split(" ");
        String nom2[] = nombre2.split(" ");
        String nom3[] = nombre3.split(" ");


        if(nom1[0].length()>nom2[0].length()&&nom1[0].length()>nom3[0].length()){
            max= nom1[0].length();
            mensaje= nombre1+" tiene el nombre mas largo" +" con "+max+" caracteres.";
        }else if(nom2[0].length()>nom1[0].length()&&nom2[0].length()>nom3[0].length()){
            max= nom2[0].length();
            mensaje= nombre2+ " tiene el nombre mas largo" +" con "+max+" caracteres.";
        }else {
            max= nom3[0].length();
            mensaje= nombre3+ " tiene el nombre mas largo" +nom3[0] +" con "+max+" caracteres.";
        }

        /*
        SOLUCION OCUPANDO TERNARIOS
        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

         */



        JOptionPane.showMessageDialog(null,mensaje);
    }
}
