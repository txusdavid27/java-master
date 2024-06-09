package variables.numericos.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DetalleDeFactura {
    public static final double IVA= 0.19d;
    public static double impuesto;
    private static final DecimalFormat df = new DecimalFormat("0.000");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITAR NOMBRE:");
        String factura = getNombre(scanner);
        System.out.println("DIGITAR PRECIO 1:");
        double precioA = getPrecio(scanner);
        System.out.println("DIGITAR PRECIO 2:");
        double precioB = getPrecio(scanner);
        double suma = suma(precioA, precioB);
        var total = calcularTotal(suma,IVA);
        mensaje(factura, suma, total);
    }

    public static void mensaje(String name, double bruto, Object neto){
        String mensaje = "La factura "+name+" tiene un " +
                         "total bruto de "+ df.format(bruto)+", " +
                         "con un impuesto de "+df.format(impuesto)+
                         " y el monto después de" +
                         " impuesto es de "+df.format(neto);
        print(mensaje);
    }

    public static void print(String val){
        System.out.println(val);
    }

    private static Object calcularTotal(double suma, double iva) {
        impuesto=(suma*iva);
        return suma+impuesto;
    }

    public static double suma(double pa, double pb){
        return pa + pb;
    }

    public static String getNombre(Scanner scanner){
        return scanner.nextLine();
    }

    public static double getPrecio(Scanner scanner){
        return scanner.nextDouble();
    }


}
