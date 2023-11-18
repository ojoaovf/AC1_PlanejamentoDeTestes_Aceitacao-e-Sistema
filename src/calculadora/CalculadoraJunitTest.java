package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraJunitTest {
    @Test
    void SomarPositivoPositivo() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(10, 10);
        assertEquals(20, soma);
    }

    @Test
    void SomarPositivoNegativo() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(10, -10);
        assertEquals(0, soma);
    }

    @Test
    void SomarNegativoNegativo() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(-10, -10);
        assertEquals(-20, soma);
    }

    @Test
    void SomarPositivoZero() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(10, 0);
        assertEquals(10, soma);
    }

    @Test
    void SomarNegativoZero() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(-10, 0);
        assertEquals(-10, soma);
    }

    @Test
    void SomarZeroZero() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(0, 0);
        assertEquals(0, soma);
    }

    @Test
    void SubtrairPositivoPositivo() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(10, 10);
        assertEquals(0, resultado);
    }

    @Test
    void SubtrairPositivoNegativo() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(10, -10);
        assertEquals(20, resultado);
    }

    @Test
    void SubtrairNegativoNegativo() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(-10, -10);
        assertEquals(0, resultado);
    }

    @Test
    void SubtrairPositivoZero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(10, 0);
        assertEquals(10, resultado);
    }

    @Test
    void SubtrairNegativoZero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(-10, 0);
        assertEquals(-10, resultado);
    }

    @Test
    void SubtrairZeroZero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(0, 0);
        assertEquals(0, resultado);
    }

    @Test
    void MultiplicarPositivoPositivo() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(10, 10);
        assertEquals(100, resultado);
    }

    @Test
    void MultiplicarPositivoNegativo() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(10, -10);
        assertEquals(-100, resultado);
    }

    @Test
    void MultiplicarNegativoNegativo() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(-10, -10);
        assertEquals(100, resultado);
    }

    @Test
    void MultiplicarPositivoZero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(10, 0);
        assertEquals(0, resultado);
    }

    @Test
    void MultiplicarNegativoZero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(-10, 0);
        assertEquals(0, resultado);
    }

    @Test
    void MultiplicarZeroZero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(0, 0);
        assertEquals(0, resultado);
    }

    @Test
    void DividirPositivoPositivo() {
        Calculadora calculadora = new Calculadora();
        String resultado = calculadora.dividir(10, 10);
        double resultadoDouble = Double.parseDouble(resultado);
        assertEquals(1, resultadoDouble);
    }

    @Test
    void DividirPositivoNegativo() {
        Calculadora calculadora = new Calculadora();
        String resultado = calculadora.dividir(10, -10);
        double resultadoDouble = Double.parseDouble(resultado);
        assertEquals(-1, resultadoDouble);
    }

    @Test
    void DividirNegativoNegativo() {
        Calculadora calculadora = new Calculadora();
        String resultado = calculadora.dividir(-10, -10);
        double resultadoDouble = Double.parseDouble(resultado);
        assertEquals(1, resultadoDouble);
    }

    @Test
    void DividirPositivoZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }

    @Test
    void DividirNegativoZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(-10, 0));
    }

}
