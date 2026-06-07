package Curso;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i=14;
        int j=8;
        int k=20;

        //Si se realiza de esta forma i+j+k/3, dara resultado equivocado
        //debido a que la division se realiza primero
        double promedio= (i+j+k)/3d;//Se debe de colocar los parentesis para darle prioridad a la suma y despues la division
        System.out.println("Promedio: "+promedio);

        //Nota: No estoy sacando promedio, estoy viendo la precedencia
        //Primero se estq haciendo la division de k/3d
        //despues ese resultado se multiplica por 10
        //Y finalmente las sumas
        promedio = i+j+k/3d*10;
        System.out.println("Promedio: "+promedio);

    }
}
