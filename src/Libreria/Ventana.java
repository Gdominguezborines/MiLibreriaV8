package Libreria;
import javax.swing.JOptionPane;
public class Ventana {
    private String mensaje;

    public Ventana(){

    }

    public Ventana(String mensaje){
        this.mensaje= mensaje;
    }

    public void visualizar(String mensaje){
        JOptionPane.showMessageDialog(null,"sale por una ventana"+mensaje);
    }


}
