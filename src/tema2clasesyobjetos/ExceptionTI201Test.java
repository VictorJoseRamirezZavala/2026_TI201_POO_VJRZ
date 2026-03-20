package tema2clasesyobjetos;

/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 2. Clases y objetos
 *             2.9 Manejo de excepciones
 *             Clase de prueba
 *Intento de programador: VJRZ
 *Fecha: 20/02/2026
 */
public class ExceptionTI201Test {

    static public void main(String args[]) { //Sepuede (String ... args), (String [] args), (String args []) 
        int a = 0;
        int b = 0;

        //excepcion por division por cero
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Operacion no valida");
            System.out.println(e.toString());
        }

        //Objeto no asignado solucion 1
        ExceptionTI201 ex; //Declara una variable tipo String llamada ex
        ex = new ExceptionTI201();
        ex.toString();

        //Objeto no asignado solucion 2 
        String str = null;

        try {
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println("error no tiene asignado");
            System.out.println(e.toString());
        }

        //int[] arr = new int[2];
        //arr[3] = 2;

        a = 2147483647;
        try {
            a++;
        } catch (Exception e) {
            System.out.println(a);
        }
        //stackoverflow
        main(args);
    }
}
