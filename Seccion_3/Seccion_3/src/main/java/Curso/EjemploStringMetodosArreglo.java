package Curso;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas= "trabalenguas";

        //Convirtiendo a array
        System.out.println("trabalenguas= "+trabalenguas.toCharArray());
        //Creamos una variable tipo char y le asignamos el arreglo
        char[] arreglo= trabalenguas.toCharArray();
        System.out.println("Largo de arreglo: "+arreglo.length);

        for(int i=0;i<arreglo.length;i++){
            System.out.println("Arreglo = "+  arreglo[i]);
        }
        // Divide la cadena cada vez que encuentra la letra "a"
        // y devuelve un arreglo de Strings
        System.out.println();
        // Nota: al imprimir directamente un arreglo se muestra su referencia en memoria        System.out.println("trabalenguasa = "+trabalenguas.split("a"));
        // Creando un arreglo de Strings (split() siempre devuelve String[])        //Este arreglo guardara los datos del split
        String[] arreglo2 = trabalenguas.split("a");
        //Recorriendo el arreglo del string, ocupando el split
        for(int i=0;i<arreglo2.length;i++){
            System.out.println("Arreglo = "+  arreglo2[i]);

        }

        //Ocuapndo el ejemplo "Alguna_imagen.docx"

        String archivo= "Alguna_imagen.docx";
        // Divide el nombre del archivo usando el punto como separador
        // El resultado se almacena en un arreglo de Strings
        String[] archivoArray = archivo.split("\\.");
        //Recorremos eL Array, y solo se debe de mostrar lo que hay cuando se encuentra al punto
        for(int i=0;i<archivoArray.length;i++){
            System.out.println("Arreglo = "+  archivoArray[i]);
        }
        System.out.println("Extension= "+archivoArray[archivoArray.length-1]);


    }
}
