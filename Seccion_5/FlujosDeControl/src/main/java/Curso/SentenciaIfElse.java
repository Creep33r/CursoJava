package Curso;

public class SentenciaIfElse {
    public static void main(String[] args) {

        int promedio= 70;

        if (promedio>=90){
            System.out.println("Excelente promedio");

        }else if (promedio>=80){
            System.out.println("Buen promedio");

        }else if (promedio>=70){
            System.out.println("Aprovaste con la minima");
        }else{
            System.out.println("Reprobaste");
        }

        System.out.println("Tu promedio es: ".concat(String.valueOf(promedio)));


    }
}
