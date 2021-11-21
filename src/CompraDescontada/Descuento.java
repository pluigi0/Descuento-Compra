
package CompraDescontada;

import javax.swing.JOptionPane;

/*En Albrook se hace un 14% de descuento a los clientes cuya compra
supere los 260. Cual sera la cantidad que pagara una persona por su compra*/

public class Descuento {
    public static void main(String[] args) {
        float compra, desc = 0.14f, resultado;
        
        compra = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de la compra"));
        
        if (compra > 260){
            
            JOptionPane.showMessageDialog(null, "La compra es mayor a 300");
            resultado = desc*compra;
            compra = compra-resultado;
            JOptionPane.showMessageDialog(null, "El descuento aplicado es: "+resultado+ "\nLa compra final es: "+compra);
        }
        else {
            JOptionPane.showMessageDialog(null, "Compra menor a 300");
            JOptionPane.showMessageDialog(null, "No se aplica descuento del 14%. \nEl monto de la compra se mantiene igual: "+compra);
        }
        
    }
    
}
