/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentoventas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class DescuentoVentasTest {
    
    public DescuentoVentasTest() {
    }

    

    @Test
    public void testCalcularDescuento() {
        System.out.println("calcularDescuento PRUEBA 1");
        double valorVenta = 70000;
        double expResult = 63000;
        double result = DescuentoVentas.calcularDescuento(valorVenta);
        assertEquals(expResult, result, 0);
        
    }
    
}
