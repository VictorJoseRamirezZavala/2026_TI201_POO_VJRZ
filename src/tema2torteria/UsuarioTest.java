package tema2torteria;

/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 2. Clases y objetos
 *             Aplicación ejemplo de modelar objetos para una tortería
 *             Testeamos la clase Usuario
 *Intento de programador: VJRZ
 *Fecha: 22/04/2026
 */

public class UsuarioTest {

    public static void main(String[] args) {

        try {
            Usuario u1 = new Usuario("Victor");
            System.out.println(u1);

            Usuario u2 = new Usuario("Ana");
            System.out.println(u2);

            Usuario u3 = new Usuario("Ana");
            System.out.println(u3);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}