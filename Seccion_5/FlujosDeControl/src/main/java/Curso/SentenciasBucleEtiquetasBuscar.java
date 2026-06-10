package Curso;


public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase="tres tristes tigres tragan trigo en un trigal";
        String palabra="trigo";
        int maxPalabra=palabra.length();
        int maxFrase=frase.length()-maxPalabra;
        int cantidad=0;
        char letra= 'g';
        buscar:
        for(int i=0;i<maxFrase;i++){
            //Variable para recorrer frase.charAt, sin afectar los demas
            int k=i;
            for(int j=0;j<=maxPalabra;j++){
            //SI FRASE.CHARAT(EN K) ES DIFERENTE DE PALABRA.CHARAT(EN LA POSICION J)
            if(frase.charAt(k++)!=palabra.charAt(j)){
                continue buscar;//SI ES DIFERENTE CONTINUA A LA SIGUIENTE ITERACION
            }
            }
            cantidad++;//SOLO VA A AUMENTAR HASTA QUE TODO EL ARREGLO DE LA PALABRA SE RECORRA

        }
        System.out.println("Encontrado = "+cantidad+" veces la palabra"+"\'"+palabra+"\'");

    }
}
