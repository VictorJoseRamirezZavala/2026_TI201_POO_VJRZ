package tema2clasesyobjetos;
/*
 * 2026 ITESS.TICS
 * Periodo Enero-Junio
 *Asignatura: Programacion orientada a objetos
 *Docente: Francisco Javier Montecillo Puente
 *Descripción: Tema 2. Clases y objetos
 *             2.9 Manejo de excepciones
 *Intento de programador: VJRZ
 *Fecha: 20/02/2026
 */
public class Automovil {
    private String marca;
    private String modelo;
    private String cilindros;

    public Automovil(String marca, String modelo, String cilindros) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    Automovil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", modelo=" + modelo + ", cilindros=" + cilindros + '}';
    }
    
    

}
