package tema2torteria;

/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 2. Clases y objetos
 *             Aplicación ejemplo de modelar objetos para una tortería
 *             Testeamos la clase Torta
 *Intento de programador: VJRZ
 *Fecha: 21/04/2026
 */

public class OrdenTest {

    public static void main(String[] args) {

        try {
            Usuario u = new Usuario("Victor");

            Torta t = new Torta();
            t.setNombre("Cubana");
            t.setPrecio(60);

            Pedido p = new Pedido(u, t);

            Orden o = new Orden(p, 1, true, "cocina");

            System.out.println(o);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}