/**
 * @author Jorge Lucero
 */

package Main;

public class Main {

    public static void main(String[] args) {
        
        SoyUnico ricardo = SoyUnico.getSingletonInstance("Jorge Andrés");
        SoyUnico ramon = SoyUnico.getSingletonInstance("Ricardo");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());
        
      
    }

}
