package br.com.rafaelblomer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SequenciaFibonacciTest {

    @Test
    public void testEncontrarElemento_HappyPath() {
        int value = SequenciaFibonacci.encontrarElemento(10);

        assertEquals(55, value);
    }

    @Test
    public void testEncontrarElemento_nEh1() {
        int value = SequenciaFibonacci.encontrarElemento(1);

        assertEquals(1, value);
    }

    @Test
    public void testEncontrarElemento_nEh0() {
        int value = SequenciaFibonacci.encontrarElemento(0);

        assertEquals(0, value);
    }
}
