package Libreria;
import javax.swing.*;
/**
 * @author cambes
 */

public class InVentana implements InterfaceMetodoComunes{
    @Override
    public void visualizar(String mensaje) {

    }

    @Override
    public void introducirDatos() {
        String entrada=JOptionPane.showInputDialog(null,"Por favor, introduzca los datos de entrada");

    }
}