import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numIntroducido=0;
        String resulBinario;
        String resulOctal;
        String resulHexa;
        String mensaje;

        try {numIntroducido=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Introduce un numero entero","Mensaje de error",JOptionPane.QUESTION_MESSAGE));

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error, Introduce un numero entero","Mensaje de error",JOptionPane.ERROR_MESSAGE);
            main(args);
            System.exit(0);
        }


        int numeroDecimal=1000;
        System.out.println("numeroDecimal = " + numIntroducido);

        resulBinario= "numero binario de " +numIntroducido+"=" + Integer.toBinaryString(numIntroducido);
        System.out.println(resulBinario);

        int numeroBinario=0B1111101000;
        System.out.println("numeroBinario = " + numeroBinario);

        resulOctal = "numeroOctal de = " + numIntroducido+"=" + Integer.toOctalString(numIntroducido);
        System.out.println(resulOctal);

        int numeroOctal=01750;
        System.out.println("numeroOctal = " + numeroOctal);

        resulHexa="numeroHexadecimal de = " + numIntroducido+"=" + Integer.toHexString(numIntroducido);
        System.out.println(resulHexa);
        int numeroHexadecimal=0X3e8;
        System.out.println("numeroHexadecimal de = " + numeroHexadecimal);

        mensaje= "\n"+resulBinario;
        mensaje+="\n"+resulOctal;
        mensaje+="\n"+resulHexa;

        JOptionPane.showMessageDialog(null,mensaje);

    }
}
