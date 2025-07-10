package br.com.rafaelblomer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSomar_HappyPath() {
        int resultado = calculadora.somar(1, 1);

        assertEquals(2, resultado);
    }

    @Test
    public void testSubtrair_HappyPath() {
        int resultado = calculadora.subtrair(2, 1);

        assertEquals(1, resultado);
    }

    @Test
    public void testMultiplicar_HappyPath() {
        int resultado = calculadora.multiplicar(2, 2);

        assertEquals(4, resultado);
    }

    @Test
    public void testDividir_HappyPath() {
        int resultado = calculadora.dividir(10, 2);

        assertEquals(5, resultado);
    }

    @Test
    public void testDividir_DivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}
