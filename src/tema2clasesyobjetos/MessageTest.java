/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 2. Clases y objetos
 *             2.1 Definición de una clase
 *             2.2 Declaración de clases
 *             2.3 Miembros de una clase
 *             2.2 Ámbito referente a una clase
 *             2.2 Especificadores de acceso
 *Intento de programador: VJRZ
 *Fecha: 16/02/2026
 */
package tema2clasesyobjetos;

public class MessageTest { //crea el primer objeto por que tiene un metodo main

    public static void main(String... B) { //crea el segundo objeto al ejecutarse el metodo main
        //System.out.println(B);
        Message msg = new Message(); //asignacion!! //el new crea el tercer objeto 
        //y a su vez crea el cuarto objeto dentro de la clase message por que tiene un string
        //Declara un atributo msg de tipo message y asignale un message con valor default

        //Aqui no vive "a" ni "msg1", estos solo existen apartir de que se crean
        int a; //este es un dato primitivo o dato puro "int, 

        //Creación de objetos
        Message msg1; //esto no es creacion de objeto, es una declaracion de dato, este es un objeto,
        //contiene atributos y metodos, en este caso tiene "NULL" 
        //Declara un atributo msg1 de tipo message

        Message hola = new Message("Hola");

        // clases predefinidas "Object", arreglos, String
        int b;
        int arr[] = new int[5];
        int arr2[] = {1, 2, 3,};
        Message msgs[] = new Message[20];

        String str = "Soy un String";

    }

    public static void main() {

    }
}
