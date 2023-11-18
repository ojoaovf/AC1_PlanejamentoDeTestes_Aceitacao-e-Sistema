package calculadora;

/**
 * Classe para realizar operações básicas de uma calculadora.
 * Suporta operações de soma, subtração, multiplicação e divisão.
 * 
 * @author João Victor
 * @version 1.0
 * @since 2023-11-17
 */
public class Calculadora {

    /**
     * Realiza a soma de dois números inteiros.
     * 
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return O resultado da soma.
     */
    public double somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     * 
     * @param a O número do qual será subtraído.
     * @param b O número a ser subtraído.
     * @return O resultado da subtração.
     */
    public double subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     * 
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O resultado da multiplicação.
     */
    public double multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros.
     * 
     * @param a O número que será dividido.
     * @param b O número pelo qual será dividido.
     * @return O resultado da divisão como uma string. Se a divisão por zero ocorrer, retorna "Resultado indefinido."
     */
    public String dividir(int a, int b) {
        if (b == 0) {
            return "Resultado indefinido.";
        }
        double resultado = (double) a / b;
        return String.valueOf(resultado);
    }
}
