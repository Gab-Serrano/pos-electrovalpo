package com.elctrovalpo;

/**
 *
 * @author Gabriel
 */
public interface ImpuestoIVA {
    
    double IVA = 0.19;
    
    default int calcularIVA(int precioSinIVA){
        return (int) (precioSinIVA * IVA);
    }
    
}
