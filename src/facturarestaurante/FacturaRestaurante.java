/* Un restaurante que se está sistematizando completamente quiere que se le elabore 
un programa que le imprima una factura de cobro para sus clientes teniendo en cuenta 
que por compras iguales o mayores a $200.000 se le otorgara un descuento del 15%, por 
compras iguales o superiores a $50.000 será un descuento del 2%, por compras iguales 
o superiores a $20.000 un descuento del 1.5% y por compras inferiores no habrá descuento, 
la factura debe llevar el valor del bono de descuento el total a pagar y un agradecimiento
al comprador el cual debe ingresar su nombre. */

package facturarestaurante;

import java.util.Scanner;

public class FacturaRestaurante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario ingresar el monto de la compra
        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        double descuento = 0.0;
        
        
        if (montoCompra >= 200000) {
            descuento = 0.15;
        } else if (montoCompra >= 50000) {
            descuento = 0.02;
        } else if (montoCompra >= 20000) {
            descuento = 0.015;
        } 

        // Calcular el valor del bono de descuento
        double valorDescuento = montoCompra * descuento;

        // Calcular el total a pagar
        double totalPagar = montoCompra - valorDescuento;

        // Imprimir la factura
        System.out.println("\nFactura de Cobro");
        System.out.println("================");
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto de la compra: $" + montoCompra);
        System.out.println("Descuento aplicado: $" + valorDescuento);
        System.out.println("Total a pagar: $" + totalPagar);
        System.out.println("\n¡Gracias por su compra, " + nombre + "!");
        
    }
    
}
