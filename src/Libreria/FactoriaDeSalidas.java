package Libreria;

/**
 * @author cambes
 */

public class FactoriaDeSalidas {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;
    public static final int IMPRESORA = 3;

    public static InterfaceMetodoComunes getProductoSalida(int tipo){
        switch (tipo){
            case 1:
                return new Consola();
            case 2:
                return new Ventana();
            case 3:
                return new Impresora();

            default:
                return null;
        }
    }
}