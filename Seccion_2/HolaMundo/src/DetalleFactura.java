import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        double precio1;
        double precio2;
        double totalBruto=0;
        double impuestos=0;
        double totalConImpuestos=0;
        String nombreFactura= "";

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del factura ");
        nombreFactura= leer.nextLine();
        System.out.println("Ingresa el precio de la factura ");
        precio1=leer.nextDouble();
        System.out.println("Ingresa el precio de la factura ");
        precio2=leer.nextDouble();
        totalBruto=precio1+precio2;
        impuestos=totalBruto*0.19;
        totalConImpuestos=totalBruto+impuestos;
        //System.out.println("La factura "+ nombreFactura+" tiene un total bruto de: "+totalBruto+" con un impuesto de: "+impuestos +" y el monto despues de impuestos es de: "+ totalConImpuestos);
//Otra forma de poder hacer la muestra de resultados seria:
        String mensaje="La factura "+ nombreFactura+" tiene un total bruto de: "+totalBruto+" con un impuesto de: "+impuestos +" y el monto despues de impuestos es de: "+ totalConImpuestos;
        System.out.println(mensaje);

    }
}
