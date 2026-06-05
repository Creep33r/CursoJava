package Curso;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();


        for(int i=0;i<100000;i++){

            //c=c.concat(a).concat(b).concat("\n");//=> se demoro 3 milisegundos con 1000,=> se demoro 5787 milisegundos con 100000
            //c +=  a + b + "\n";// => se demoro 18 milisegundos con 1000, => se demoro 2301 milisegundos con 100000
            sb.append(a).append(b).append("\n"); //=> se demoro 0-1 milisegundos con 1000, => se demoro 10 milisegundos con 100000
        }
        long fin = System.currentTimeMillis();

        System.out.println(fin-inicio);
        System.out.println("c= "+ c);
        System.out.println("sb= "+sb.toString());
    }

}
