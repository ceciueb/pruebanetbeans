/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentoventas;

/**
 *
 * @author Cecilia Avila
 */
public class DescuentoVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }//cierra main

    public static double calcularDescuento(double valorVenta) {
        //return
        if (valorVenta > 50000) {
            return (valorVenta * 0.1);
        }
        return valorVenta;
        //ALT + SHIFT + F
    }//cierra calcularDescuento

}//cierra clase
