
/**
 * Primer programa de refresco desde que dejé Java en el 2005.
 * @author yofeliz
 */

import java.util.*;

public class HolaMundo {
    public static void main(String [] params) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a mi primer programa de refresco.");
        System.out.print("Por favor, introduce tu nombre: ");
        String nombreUsuario = entrada.next();
        System.out.println("Muchas gracias, " + nombreUsuario + ". No dejes de visitar mi página: www.yofeliz.com");
    }
}
