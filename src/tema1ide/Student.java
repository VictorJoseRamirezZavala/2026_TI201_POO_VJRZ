/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 1. Entorno de desarrollo
 *             1.2 Proceso de desarrollo de aplicaciones
 *Intento de programador: VJRZ
 *Fecha: 09/02/2026
 */
package tema1ide;

public class Student {

    public Student(String tI25110104, String victor, String tiCs, String male) {
        this.controlNumber = "";
        this.name = "";
        this.career = "";
        this.gender = "";
    }

    private String controlNumber;
    private String name;
    private String career;
    private String gender;

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "controlNumber=" + controlNumber + ", name=" + name + ", career=" + career + ", gender=" + gender + '}';
    }


}
