import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        int numIntroducido=0;
        String numScan;
        String resulBinario;
        String resulOctal;
        String resulHexa;
        String mensaje;

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce el numero entero");
        //numScan=leer.nextLine();

        try {numIntroducido= leer.nextInt();  //Integer.parseInt(numScan);

        }catch (InputMismatchException e){
            System.out.println("Error, Introduce un numero entero!!!!!!!!!!!!!!!!!");
            main(args);
            System.exit(0);
        }

        int numeroDecimal=1000;
        System.out.println("numeroDecimal = " + numIntroducido);

        resulBinario= "numero binario de " +numIntroducido+"=" + Integer.toBinaryString(numIntroducido);

        resulOctal = "numeroOctal de = " + numIntroducido+"=" + Integer.toOctalString(numIntroducido);


        resulHexa="numeroHexadecimal de = " + numIntroducido+"=" + Integer.toHexString(numIntroducido);

        mensaje= "\n"+resulBinario;
        mensaje+="\n"+resulOctal;
        mensaje+="\n"+resulHexa;

        System.out.println(mensaje);

    }
}
