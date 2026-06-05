public class PrimitivosCaracter {
    public static void main(String[] args) {
        char caracter = 'a';
        char decimal= 64;
        System.out.println("decimal = " + decimal);

        char espacio = '\u0020' ;
        char retroceso= '\b';
        char tabulador= '\t' ;
        char nuevaLinea= '\n';


        System.out.println("caracter = " + caracter);
        System.out.println("tipo char correspondiente en bite a:" + System.lineSeparator() + Character.SIZE);
        System.out.println("tipo char correspondiente en bytes a: " + Character.BYTES);
        System.out.println("Valor maximo de un char es: "+Character.MAX_VALUE);
        System.out.println("Valor minimo de un char es: "+Character.MIN_VALUE);



    }
}
