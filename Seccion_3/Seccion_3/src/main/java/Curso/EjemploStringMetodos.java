package Curso;

import java.sql.SQLOutput;

public class EjemploStringMetodos {

    public static void main(String[] args) {

        String nombre = "Samuel";
        //Retorna lo largo de la cadema
        System.out.println("nombre.lenght() = "+nombre.length());
        //Retorna todo en mayusculas
        System.out.println("nombre.toUpperCase() = "+nombre.toUpperCase());
        //Retorna todo en minusculas
        System.out.println("nombre.toLowerCase() = "+nombre.toLowerCase());
        //Comparar un string con otro, pero a nivel de valor, no de instancia
        System.out.println("nombre.equals(\"Samuel\") = " + nombre.equals("Samuel"));
        System.out.println("nombre.equals(\"samuel\") = " + nombre.equals("samuel"));
        //Comparar un string pero ignorando las mayusculas y minusculas
        System.out.println("nombre.equalsIgnoreCase(\"SaMueL\") = " + nombre.equalsIgnoreCase("SaMueL"));
        //comparar caracteres,a nivel de orden alfabetico(lexicografico),
        System.out.println("nombre.compareTo(\"Samuel\") = " + nombre.compareTo("Samuel"));
        System.out.println("nombre.compareTo(\"Israel\") = " + nombre.compareTo("Israel"));
        //Convertir el string en caracterees, o obtener un caracter en particular
        System.out.println("nombre.charAt(0)= "+ nombre.charAt(0));
        System.out.println("nombre.charAt(2)= "+ nombre.charAt(2));
        System.out.println("nombre.charAt(5)= "+ nombre.charAt(5));
        //Obtener directamente el ultimo caracter de forma dinamica
        System.out.println("nombre.charAt(nombre.length()-1)= "+ nombre.charAt(nombre.length()-1));
        //Obtiene parte del String, recibe como parametro desde que caracter(numero) en adelante se mostrara
        System.out.println("nombre.substring = "+nombre.substring(1));
        System.out.println("nombre.substring = "+nombre.substring(3));
        //Tambien esta la otra parte, es decir puede recibir 2 parametros,
        // con la aclaracion de que el hasta(osea el limite) no se incluye
        //desde(2) hasta (4), en este ejemplo el 2 se incluira pero el caracter 4 no
        System.out.println("nombre.substring = "+nombre.substring(2,4));
        //Ahora el ultimo caracter
        System.out.println("nombre.substring = "+nombre.substring(nombre.length()-1));
        //Ahora desde los 2 ultoms
        System.out.println("nombre.substring = "+nombre.substring(nombre.length()-2));


        String trabalenguas= "trabalenguas";
        //Replace, aqui recibe 2 parametros, en el primero va el que va a ser remplazado, y en el segundo el que lo va a reemplazar
        System.out.println("trabalenguas= "+trabalenguas.replace("a","."));
        System.out.println("trabalenguas= "+trabalenguas);
        //Este metodo permite saber si se encuentra algun caracter dentro del string
        //Osea si quieres buscar una a, este metodo te traera la primera que encuentres
        //Solo te traera su posicion
        System.out.println("trabalenguas= "+ trabalenguas.indexOf('a'));
        //Ahora este es lo opuesto, este trae la ultima ocurrencia
        System.out.println("trabalenguas= "+ trabalenguas.lastIndexOf('a'));
        //Si no existe la letra que le pasamos por parametro nos retornara un -1
        System.out.println("trabalenguas= "+ trabalenguas.lastIndexOf('z'));
        //Contains es parecido al metodo anterior, tambien recibe una secuencia de caracteres
        //Solo retorna true o false, recibe string como parametro
        //Y compara si existe esa secuencia dentro
        System.out.println("trabalenguas.contains(t) = "+ trabalenguas.contains("lenguas"));
        //Este sirve para saber si comienza con, y retorna true o false
        //Tambien recibe una secuencia de caracteres
        System.out.println("trabalenguas.startWith(\"\")= "+ trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startWith(\"\")= "+ trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.startWith(\"\")= "+ trabalenguas.startsWith("tr"));
        //Tambien existe su opuesto, el termina con(parametro)
        System.out.println("trabalenguas.endWith(\"\")= "+ trabalenguas.endsWith("tr"));
        System.out.println("trabalenguas.endWith(\"\")= "+ trabalenguas.endsWith("uas"));
        System.out.println(" trabalenguas ");
        //El siguiente metodo quita los espacios en blanco
        System.out.println(" trabalenguas ".trim());



    }
}
