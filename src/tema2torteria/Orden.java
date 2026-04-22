package tema2torteria;

public class Orden {

    private Pedido pedido;
    private int prioridad;
    private boolean pago;
    private String estatus;

    public Orden(Pedido pedido, int prioridad, boolean pago, String estatus) {
        this.pedido = pedido;
        this.prioridad = prioridad;
        this.pago = pago;
        this.estatus = estatus;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "pedido=" + pedido +
                ", prioridad=" + prioridad +
                ", pago=" + pago +
                ", estatus=" + estatus +
                '}';
    }
}
