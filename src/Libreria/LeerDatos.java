package Libreria;
import javax.swing.*;

/**
 * @author cambes
 */


public class LeerDatos {

    public  static String leerString(String mensaje){
        return (JOptionPane.showInputDialog(null, mensaje));
    }
    public static int leerInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
}