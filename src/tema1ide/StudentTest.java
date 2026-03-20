/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 1. Entorno de desarrollo
 *             1.2 Proceso de desarrollo de aplicaciones
 *Intento de programador: VJRZ
 *Fecha: 10/02/2026
 */
package tema1ide;

public class StudentTest {

    public static void main(String[] args) {
        //prueba de constructor default
        
        System.out.println("Prubea de constructor default ::::::::::::::");
        Student student1 = new Student();
        System.out.println(student1.toString());

        //prueba de constructor con parametros
        System.out.println("Prubea de constructor default ::::::::::::::");
        Student student2 = new Student("TI25110104", "Victor", "TICs", "Male");
        System.out.println(student2.toString());

        //prueba de getters and setters
        System.out.println("Prubea de constructor con getter and setter ::::::::::::::");
        student2.setControlNumber("TI25110103");
        System.out.println(student2.getControlNumber());
        
        student2.setName("TI25110103");
        System.out.println(student2.getName());
        
        student2.setControlNumber("TI25110103");
        System.out.println(student2.getControlNumber());
        
        student2.setControlNumber("TI25110103");
        System.out.println(student2.getControlNumber());
    }
}
