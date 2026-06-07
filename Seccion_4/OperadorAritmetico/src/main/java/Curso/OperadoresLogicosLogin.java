package Curso;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

       /* Primer metodo
        String[] usernames = new String[3];
        String[] paswords=    new String[3];
        usernames[0] = "Samuel";
        paswords[0] = "12345";

        usernames[1] = "admin";
        paswords[1] = "admin123";

        usernames[2] = "Jorel";
        paswords[2] = "jorel123"; */

        //Segundo metodo
        String[] usernames= {"Samuel","admin","Jorel"};
        String[] paswords= {"12345","admin123","jorel123"};



        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el usuario");
        String u = leer.next();

        System.out.println("Ingresa el password");
        String p = leer.next();

        boolean esAuteticado=false;

        for(int i=0;i<usernames.length;i++){

            if( (usernames[i].equals(u) && paswords[i].equals(p) )) {
                esAuteticado=true;
                break;
            }
        }


        if(esAuteticado){
            System.out.println("Bienvenido ".concat(u).concat(" !!!"));
        }else{
            System.out.println("Error: Usuario o Password incorrecto");
        }

    }
}
