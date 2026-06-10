package Curso;

public class SentenciaBucleEtiqueta {
    public static void main(String[] args) {

        bucle1:
//Etiquetando al primer bucle, pueded estar o alado, pero debe de estar pegado al bucle
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {

                    continue bucle1;
                }
                System.out.println("[i = " + i + ", J= " + j + "],");

            }//Segundo for

        }//Primer for
        System.out.println("=====================================================");
        System.out.println("=====================================================");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {

                    break etiqueta;
                }
                System.out.println("[i = " + i + ", J= " + j + "],");

            }//Segundo for
        }//Primer for
        System.out.println("=====================================================");
        System.out.println("=====================================================");
        etiquetaWhile:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            int j = 0;
            while (j < 5) {
                if (i == 2) {
                    continue etiquetaWhile;
                }
                System.out.println("[i = " + i + ", J= " + j + "],");
                j++;
            }

        }//Primer for

        System.out.println("=====================================================");
        System.out.println("=====================================================");

        etiquetaWhile2:
        for (int i = 1; i <= 7; i++) {

            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": Descanso de fin de semana");
                    continue etiquetaWhile2;
                }else{
                System.out.println("Dia" + i + "Trabajando a las " + j);
                j++;
                }
            }
        }


    }

}
