package Test;


import Clases.EjerciciosVector;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosVectorTest {

    @org.junit.jupiter.api.Test
    void duplicarValoresVectorIniciado() {
        boolean exceptionProducida = false;
        try {
            EjerciciosVector ejerciciosVector = new EjerciciosVector(new double[]{4,5,6,8,9});
            ejerciciosVector.duplicarValores();
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método ha producido excepciones");
    }

    @org.junit.jupiter.api.Test
    void duplicarValoresVectorNoIniciado() {
        boolean exceptionProducida = false;
        try {
            Vector vector = new Vector();
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método ha producido excepciones");

    }

    @org.junit.jupiter.api.Test
    void obtenerMaximoIniciado() {
    }

    @org.junit.jupiter.api.Test
    void obtenerMaximoNoIniciado() {
    }

    @org.junit.jupiter.api.Test
    void contieneValorNoIniciado() {
    }

    @org.junit.jupiter.api.Test
    void contieneValorIniciadoEnRango() {
    }

    @org.junit.jupiter.api.Test
    void contieneValorIniciadoFueraDeRango() {
    }
}