package tema2torteria;

/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 2. Clases y objetos
 *             Aplicación ejemplo de modelar objetos para una tortería
 *             Testeamos la clase Pedido
 *Intento de programador: VJRZ
 *Fecha: 22/04/2026
 */

public class PedidoTest {

    public static void main(String[] args) {

        try {
            Usuario u = new Usuario("Victor");

            Torta t = new Torta();
            t.setNombre("Cubana");
            t.setPrecio(55);

            t.agregarIngrediente("Jamon");
            t.agregarIngrediente("Queso");

            Pedido p = new Pedido(u, t);

            System.out.println("Nombre del usuario: " + p.getNombreDeUsuario());
            System.out.println("Nombre de la torta: " + p.getNombreDeTorta());
            System.out.println("Precio: " + p.getPrecio());

            System.out.println(p);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
