package tema2torteria;

/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 2. Clases y objetos
 *             Aplicación ejemplo de modelar objetos para una tortería
 *Intento de programador: VJRZ
 *Fecha: 20/04/2026
 */

public class Usuario {

    private static String ultimoUsuario;
    private String nombre;

    public Usuario() {}

    public Usuario(String nombre) throws Exception {
        if(nombre.equals(ultimoUsuario)){
            throw new Exception("El usuario ya existe");
        }
        this.nombre = nombre;
        ultimoUsuario = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if(nombre.equals(ultimoUsuario)){
            throw new Exception("El usuario ya existe");
        }
        this.nombre = nombre;
        ultimoUsuario = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + '}';
    }
}
