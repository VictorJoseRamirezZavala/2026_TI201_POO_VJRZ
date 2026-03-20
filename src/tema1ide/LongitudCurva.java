/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Calculo Integral
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Calcula la distancia aproximada de una curva
 *Intento de programador: VJRZ
 *Fecha: 11/02/2026
 */
package tema1ide;

import java.util.Scanner;

public class LongitudCurva {
    // Función (puedes cambiarla)

    public static double f(double x) {
        return x * x;  // Ejemplo: y = x^2
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b;
        int n;

        System.out.println("Calculo aproximado de la longitud de una curva");

        System.out.print("Ingresa el valor inicial (a): ");
        a = scanner.nextDouble();

        System.out.print("Ingresa el valor final (b): ");
        b = scanner.nextDouble();

        System.out.print("Ingresa el numero de divisiones (n): ");
        n = scanner.nextInt();

        double h = (b - a) / n;
        double longitud = 0;

        System.out.println("\nDistancias punto a punto:\n");

        for (int i = 0; i < n; i++) {

            double x1 = a + i * h;
            double x2 = a + (i + 1) * h;

            double y1 = f(x1);
            double y2 = f(x2);

            double distancia = Math.sqrt(
                    Math.pow(x2 - x1, 2)
                    + Math.pow(y2 - y1, 2)
            );

            longitud += distancia;

            System.out.println("Punto " + i + " a Punto " + (i + 1)
                    + " -> Distancia = " + distancia
                    + " | Suma acumulada = " + longitud);
        }

        System.out.println("\n=================================");
        System.out.println("Longitud total aproximada: " + longitud);

        scanner.close();
    }
}
