/*
Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online, el cual calcule el precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

Requisitos:

1. La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
2. Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.b.
3. El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos o gastos de envío), supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.
4. A continuación, algunos ejemplos de una factura modelo:
 */
package taller.pkg6.problema.pkg1;
import java.util.Scanner;
public class Taller6Problema1 {
    public static void main(String[] args) {
        double costoP1, costoP2, transporte, descuentoP, descuento, ivaP, iva, montoI, montoI2, montoF;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el costo del Primer Producto");
        costoP1 = teclado.nextDouble();
        System.out.println("Ingresar el costo del Segundo Producto");
        costoP2 = teclado.nextDouble();
        ivaP = 10;
        montoI = costoP1+costoP2;
        iva = montoI*ivaP/100;
        montoI2= montoI+iva;
        if (montoI2 >= 1000){
            if (montoI2 >= 500){
                descuentoP = 20;
                transporte = 0;
            }
            else {
                descuentoP = 20;
                transporte = 100;
            }
        }
        else {
            descuentoP = 5;
            transporte = 100;
        }
        descuento = montoI2*descuentoP/100;
        montoF = (montoI2 - descuento)+transporte;
        System.out.println("======================================================");
        System.out.println("Costo del Primero Producto: "+costoP1);
        System.out.println("Costo del Segundo Procducto: "+costoP2);
        System.out.println("El Costo de ambos Productos es : "+montoI);
        System.out.println("El Descuento es: "+descuento);
        System.out.println("IVA: "+iva);
        System.out.println("El Costo del transporte es: "+transporte);
        System.out.println("El Monto Final a pagar es: "+montoF);
        System.out.println("======================================================");
    }
}
//desarrollado por Manuel Gomez