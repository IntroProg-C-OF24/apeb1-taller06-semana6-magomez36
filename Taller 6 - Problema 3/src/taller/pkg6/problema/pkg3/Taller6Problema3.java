/*
Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete. Si el peso es menor de 5 kg y la región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 */
package taller.pkg6.problema.pkg3;
import java.util.Scanner;
public class Taller6Problema3 {
    public static void main(String[] args) {
        int peso, tarifa, region;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero dependiendo de la region");
        System.out.println("1 <--- Local");
        System.out.println("2 <--- Nacional");
        region = teclado.nextInt();
        System.out.println("Ingrese el peso del paquete");
        peso = teclado.nextInt();
        if (region <= 1){
            if (peso <= 5) {
                tarifa = 5;
            }
            else {
                tarifa = 15;
            }
        }
        else {
            if (peso >= 5){
                tarifa = 10;
            }
            else {
                tarifa = 15;
            }
        }
        System.out.println("La tarifa es :"+tarifa);
    }
}
//desarrollado por Manuel Gomez