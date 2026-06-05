public class PrimitivosEnteros {
    public static void main(String[] args) {
        //Primitivos enteros

        byte numero_Byte=127;
        System.out.println("numero Byte: "+ numero_Byte);
        System.out.println("tipo byte correspondiente en bite a: " + Byte.SIZE);
        System.out.println("tipo byte correspondiente en bytes a: " + Byte.BYTES);
        System.out.println("Valor maximo de un Byte es: "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de un Byte es: "+Byte.MIN_VALUE);

        short numero_Short=32767;
        System.out.println("numero Short = " + numero_Short);
        System.out.println("tipo short correspondiente en bite a: " + Short.SIZE);
        System.out.println("tipo short correspondiente en bytes a: " + Short.BYTES);
        System.out.println("Valor maximo de un short es: "+Short.MAX_VALUE);
        System.out.println("Valor minimo de un short es: "+Short.MIN_VALUE);

        int numero_Int=2147483647;
        System.out.println("numero_Int = " + numero_Int);
        System.out.println("tipo int correspondiente en bite a: " + Integer.SIZE);
        System.out.println("tipo int correspondiente en bytes a: " + Integer.BYTES);
        System.out.println("Valor maximo de un int es: "+Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int es: "+Integer.MIN_VALUE);

        long numero_Long= 9223372036854775807L;//Los long se le asigna una L al final
        System.out.println("numero_Long = " + numero_Long);
        System.out.println("tipo long long correspondiente en bite a: " + Long.SIZE);
        System.out.println("tipo long long correspondiente en bytes a: " + Long.BYTES);
        System.out.println("Valor maximo de un long es: "+Long.MAX_VALUE);
        System.out.println("Valor minimo de un long es: "+Long.MIN_VALUE);


        var numeroVar= 127;//Siempre sera un int hasta que se sobrepase ese limite y se le asigne la letra


    }
}
