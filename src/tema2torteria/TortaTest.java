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

public class TortaTest {
   public static void main (String[]args){
        //provar el constric
        Torta tortConstructorDefault =new Torta();
        
    try {
        tortConstructorDefault.agregarIngredientes("Jamon");
        tortConstructorDefault.agregarIngredientes("Queso");
        tortConstructorDefault.agregarIngredientes("Lechuga");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
            
        System.out.println(tortConstructorDefault.toString());
    } 
}
