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

public class Pedido {

    private Usuario usuario;
    private Torta torta;

    public Pedido(Usuario usuario, Torta torta) {
        this.usuario = usuario;
        this.torta = torta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Torta getTorta() {
        return torta;
    }

    public void setTorta(Torta torta) {
        this.torta = torta;
    }

    public String getNombreDeUsuario() {
        return usuario.getNombre();
    }

    public String getNombreDeTorta() {
        return torta.getNombre();
    }

    public float getPrecio() {
        return torta.getPrecio();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "usuario=" + usuario +
                ", torta=" + torta +
                '}';
    }
}
