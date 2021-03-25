package Libreria;
import javax.swing.*;

/**
 * @author cambes
 */

public class CrearArray {
    @Override
    public String toString() {
        return "CrearArray{}";
    }

    static int longitudArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tamaño del array"));

    public static int[] crearArrayInt() {
        int[] arrayInt = new int[longitudArray];
        for (int i = 0; i < longitudArray; i++) {
            arrayInt[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor entero para  " + i));
        }
        return arrayInt;
    }

    public static float[] crearArrayFloat() {
        float[] arrayFloat = new float[longitudArray];
        for (int i = 0; i < longitudArray; i++) {
            arrayFloat[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor decimal para " + i));
        }
        return arrayFloat;
    }

    public static String[] crearArraString() {
        String[] arrayString = new String[longitudArray];
        for (int i = 0; i < longitudArray; i++) {
            arrayString[i] = JOptionPane.showInputDialog(null, "Introudce el texto para " + i);
        }
        return arrayString;
    }

    public static void verArrayInt(int[] lista) {
        for (int ele : lista)
            JOptionPane.showMessageDialog(null, ele);
    }
}
