/*
Clasificación de un triángulo Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:

Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 */
package taller.pkg6.problema.pkg2;
import java.util.Scanner;
public class Taller6Problema2 {
    public static void main(String[] args) {
        double long1, long2, long3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar Primera Longitud");
        long1 = teclado.nextDouble();
        System.out.println("Ingresar Segunda Longitud");
        long2 = teclado.nextDouble();
        System.out.println("Ingresar Tercera Longitud");
        long3 = teclado.nextDouble();
        if (long1 == long2) {
            if (long2 == long3){
                System.out.println("Triangulo equilatero");
            }
            else {
                System.out.println("Triangulo isosceles");
            }
        }
        else {
            if (long2 == long3) {
                System.out.println("Triangulo isosceles");
            }
            else {
                System.out.println("Triangulo escaleno");
            }
        }
    }
}
//desarrollado por Manuel Gomez