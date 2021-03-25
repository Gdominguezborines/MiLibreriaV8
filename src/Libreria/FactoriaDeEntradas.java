package Libreria;

/**
 * @author cambes
 */

public class FactoriaDeEntradas {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;


    public static InterfaceMetodoComunes getProductoEntrada(int tipo) {
        switch (tipo) {
            case CONSOLA:
                return new InConsola();
            case VENTANA:
                return new InVentana();

            default:
                return null;
        }
    }
}
