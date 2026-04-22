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

public class Torta {

    public static final int MAX_INGREDIENTES=10;
    private String nombre;
    private String[] ingredientes; //faltan los corchetes []
    private int numeroIngredientes;
    private float precio;

    public Torta() {
        ingredientes = new String[MAX_INGREDIENTES];
        numeroIngredientes = 0;
    }

    public Torta(String nombre, String[] ingredientes, float precio) {
        this.nombre = nombre;
        //copiar los ingredientes de entrada a mi liosta de ingredientes
        this.numeroIngredientes = ingredientes.length;
        this.ingredientes = new String[MAX_INGREDIENTES];
        for (int i=0; i<numeroIngredientes; i++)
        this.ingredientes[i] = ingredientes[i];

        //this.ingredientes = ingredientes;
        this.precio = precio;
        
        
    }
    
    public Torta(String nombre) {
    this();
    this.nombre = nombre;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String listaDeIngredientes="";
        if(ingredientes != null){
            for(int i=0; i<numeroIngredientes; i++){
            listaDeIngredientes += ingredientes[i]==null?"":ingredientes[i] +",";
            }
        }
        return "Tortas{" + "nombre=" + 
                nombre + ", ingredientes=" 
                + listaDeIngredientes + ", numIngredientes=" 
                + numeroIngredientes +
                ", precio=" + precio + '}';
    }
    public void agregarIngrediente(String ingrediente) throws Exception{
        if(numeroIngredientes >= MAX_INGREDIENTES){
            System.out.print("Solo Puedes agregar 10 ingredientes!! ya tienes 10 ingredientes");
            throw new Exception("maxima cantidad de ingredeientes");
        }
        /* Agrega un nuevo ingrediente y lanza una exception si se a llegado al numero
        *
        *
        */
        
        ingredientes[numeroIngredientes]=ingrediente;
        numeroIngredientes++;
    }
}
