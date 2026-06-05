public class PrimitivosFlotantes {
    public static void main(String[] args) {
        //Nota: Float da numeros en notacion cientifica
        float realFloat= 3.4028235E38F;//Siempre se le asigna la F de float para que pueda correr
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float correspondiente en bite a: " + Float.SIZE);
        System.out.println("tipo float correspondiente en bytes a: " + Float.BYTES);
        System.out.println("Valor maximo de un float es: "+Float.MAX_VALUE);
        System.out.println("Valor minimo de un float es: "+Float.MIN_VALUE);

        double realDouble= 3.4028235E38;
        System.out.println("realDouble = " + realDouble);

        System.out.println("tipo double correspondiente en bytes a: " + Double.SIZE);
        System.out.println("tipo double correspondiente en bytes a: " + Double.BYTES);
        System.out.println("valor maximo de un double es: "+Double.MAX_VALUE);
        System.out.println("valor minimo de un double es: "+Double.MIN_VALUE);

        var realDouble2= 3.4028235E38;
        System.out.println("realDouble2 = " + realDouble2);

    }
}
