package tema2torteria;

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
