public class ConversionDeTipos {

    public static void main(String[] args) {

        //De string a otros tipos
        String numeroStr= "5050";

        int numeroInt= Integer.parseInt(numeroStr);
        System.out.println("NumeroInt = "+numeroInt);
        //Soporta notacion cientifica poniendo e-
        String realStr= "98756.43e-3";
        double realDouble= Double.parseDouble(realStr);
        System.out.println("realDouble = "+realDouble);

        String logicoStr = "false";
        boolean logico= Boolean.parseBoolean(logicoStr);
        System.out.println("logico = "+logico);
        //De otros tipos a string
        int otroNumeroInt= 100;
        System.out.println("otroNumeroInt = "+otroNumeroInt);

        String otroNumeroStr= Integer.toString(otroNumeroInt);
        System.out.println("OtroNumeroStr = "+otroNumeroStr);

        otroNumeroStr= String.valueOf(otroNumeroInt);
        System.out.println("OtroNumeroStr = "+otroNumeroStr);

        double otroRealDouble= 1.23456e2;
        System.out.println("otroRealDouble = "+otroRealDouble);
        String otroRealStr= Double.toString(otroRealDouble) ;
        System.out.println("OtroRealStr = "+otroRealStr);

        otroRealStr= String.valueOf(1.2345e2f);
        System.out.println("OtroRealStr = "+otroRealStr);

        //Conversiones entre primitivos
        int i= 32767;
        //Se forzo la conversion del int(32 bits) que son mas bits que
        //el short(16 bits), para utilizar cast, deben ser compatibles los tipos
        short s =(short)i;
        System.out.println("i = "+s);
        long j = i;
        System.out.println("f = "+j);
        float f= (float)j;
        System.out.println(Short.MAX_VALUE);

    }
}
