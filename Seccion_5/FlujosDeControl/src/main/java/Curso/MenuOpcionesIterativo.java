package Curso;

import javax.swing.*;

public class MenuOpcionesIterativo {
    public static void main(String[] args) {
        int opcion = 0;

        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Selecciona una opcion del menu:\n" +
                    "1: Actualizar\n" +
                    "2.- Eliminar\n" +
                    "3.- Agregar\n" +
                    "4.- Listar\n" +
                    "5.- Salir"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Usuario actualizado correctamente","Entrada de datos",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente","Entrada de datos",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Usuario agregado correctamente","Entrada de datos",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Usuario listado correctamente","Entrada de datos",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Haz salido con exito","Entrada de datos",JOptionPane.INFORMATION_MESSAGE);
                    break;

            }
            if(opcion <1 || opcion >5 ){
                JOptionPane.showMessageDialog(null,"Debes seleccionar una opcion valida");
            }

        }while(opcion <1 || opcion >5 );

    }
}
