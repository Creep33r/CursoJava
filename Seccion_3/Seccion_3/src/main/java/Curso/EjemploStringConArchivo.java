package Curso;

public class EjemploStringConArchivo {

    public static void main(String[] args) {

        String archivo= "Alguna_imagen.docx";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo_imagen.jpg"+archivo.length());
        System.out.println("archivo.substring(14)= "+archivo.substring(i));



    }
}
