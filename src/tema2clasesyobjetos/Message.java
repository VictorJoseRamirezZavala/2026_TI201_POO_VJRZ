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
 *Fecha: 09/02/2026
 */
package tema2clasesyobjetos;

public class Message {

    private String content;

    public Message() {
        this.content = "";
    }

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" + "content=" + content + '}';
    }

}
