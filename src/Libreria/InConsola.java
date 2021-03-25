package Libreria;
import java.util.Scanner;
/**
 * @author cambes
 */

public class InConsola implements InterfaceMetodoComunes {
    @Override
    public void visualizar(String mensaje) {

    }

    @Override
    public void introducirDatos() {

        String entrada=" ";
        System.out.println("Por favor, introduzca datos\n");
        Scanner sc = new Scanner(System.in);
        entrada=sc.nextLine();

    }
}