package Libreria;

/**
 * @author cambes
 */

public class Impresora implements InterfaceMetodoComunes {
    @Override
    public void visualizar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void introducirDatos() {

    }
}