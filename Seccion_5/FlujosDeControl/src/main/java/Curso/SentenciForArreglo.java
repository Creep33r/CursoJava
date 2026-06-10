package Curso;

import javax.swing.*;

public class SentenciForArreglo {
    public static void main(String[] args) {
        String[] nombres  = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Liz"};
        int count= nombres.length;

        for(int i=0; i<count;i++) {

            if(nombres[i].equalsIgnoreCase("andres")|| (nombres[i].equalsIgnoreCase("Liz"))){
                continue;
            }

            System.out.println(i+".- "+ nombres[i]);


        }
        String buscarNombre="";
        buscarNombre= JOptionPane.showInputDialog(null,"Ingrese el nombre a buscar, ejemplo:\"Bea\" o  \"liz\" ","Entrada de datos"
                ,JOptionPane.QUESTION_MESSAGE);
        boolean encontrado= false;
        for(int i=0; i<count; i++){

            if(nombres[i].equalsIgnoreCase(buscarNombre)){
                encontrado=true;
                break;
            }

        }
        if(encontrado==true){
            JOptionPane.showMessageDialog(null,buscarNombre.concat("Fue encontrado"),"Mensaje de confirmanciom",JOptionPane.INFORMATION_MESSAGE);

        }else {
            JOptionPane.showMessageDialog(null,buscarNombre+" no fue encontrado","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }

    }
}
