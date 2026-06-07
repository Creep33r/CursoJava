package Curso;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int i=3;
        int j=3;
        float k  = 127e-7F;
        double l= 2.1413e3;
        boolean m=false;

        //&& esto significa que "Y", ambas deben ser verdaderas
        boolean b1 = i==j && k<l && m==false;
        System.out.println("b1 = "+b1);

        // ||significa "O", al menos una debe ser verdadera
        boolean b2 = i==j || k <l;
        System.out.println("b2 = "+b2);
        //Dependiendo de como ocupemos los parentecis se evaluaran las expresiones
        boolean b3 = i==j && (k>l || m==false);
        System.out.println("b3 = "+b3);

        //De acuerdo con la precedencia de los operadores
        //El and(&&) tiene mayor prioridad que el or(||)
        //Por ende en la siguiente operacion se evalua primero
        //k<l && m==true y al ultimo el or(||)
        boolean b4 = i==j || k<l && m==true;
        System.out.println("b4 = "+b4);

        //De forma mas explicita
        boolean b5 = true || true && false ;
        System.out.println("b5 = "+b5);

        //Pero si cambiamos la precedencia con los parentesis
        boolean b6 = (true || true) && false ;
        System.out.println("b6 = "+b6);

        //Otro ejemplo de la precedencia
        boolean b7 = true || false && false||false ;
        System.out.println("b7 = "+b7);

        boolean b8 = ((true || false) && false)||false ;//false
        System.out.println("b8 = "+b8);


    }
}
