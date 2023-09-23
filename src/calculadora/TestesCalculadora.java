package calculadora;

public class TestesCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Testes de soma
        System.out.println("Testes de soma:");
        System.out.println("1. Positivo por Positivo: 10 + 10 = " + calculadora.somar(10, 10));
        System.out.println("2. Positivo por Negativo: 10 + (-10) = " + calculadora.somar(10, -10));
        System.out.println("3. Negativo por Negativo: (-10) + (-10) = " + calculadora.somar(-10, -10));
        System.out.println("4. Positivo por Zero: 10 + 0 = " + calculadora.somar(10, 0));
        System.out.println("5. Negativo por Zero: (-10) + 0 = " + calculadora.somar(-10, 0));
        System.out.println("6. Zero por Zero: 0 + 0 = " + calculadora.somar(0, 0));

        // Testes de subtração
        System.out.println("\nTestes de Subtração:");
        System.out.println("1. Positivo por Positivo: 10 - 10 = " + calculadora.subtrair(10, 10));
        System.out.println("2. Positivo por Negativo: 10 - (-10) = " + calculadora.subtrair(10, -10));
        System.out.println("3. Negativo por Negativo: (-10) - (-10) = " + calculadora.subtrair(-10, -10));
        System.out.println("4. Positivo por Zero: 10 - 0 = " + calculadora.subtrair(10, 0));
        System.out.println("5. Negativo por Zero: (-10) - 0 = " + calculadora.subtrair(-10, 0));
        System.out.println("6. Zero por Zero: 0 - 0 = " + calculadora.subtrair(0, 0));

        // Testes de multiplicação
        System.out.println("\nTestes de Multiplicação:");
        System.out.println("1. Positivo por Positivo: 10 * 10 = " + calculadora.multiplicar(10, 10));
        System.out.println("2. Positivo por Negativo: 10 * (-10) = " + calculadora.multiplicar(10, -10));
        System.out.println("3. Negativo por Negativo: (-10) * (-10) = " + calculadora.multiplicar(-10, -10));
        System.out.println("4. Positivo por Zero: 10 * 0 = " + calculadora.multiplicar(10, 0));
        System.out.println("5. Negativo por Zero: (-10) * 0 = " + calculadora.multiplicar(-10, 0));
        System.out.println("6. Zero por Zero: 0 * 0 = " + calculadora.multiplicar(0, 0));

        // Testes de divisão
        System.out.println("\nTestes de Divisão:");
        System.out.println("1. Positivo por Positivo: 10 / 10 = " + calculadora.dividir(10, 10));
        System.out.println("2. Positivo por Negativo: 10 / (-10) = " + calculadora.dividir(10, -10));
        System.out.println("3. Negativo por Negativo: (-10) / (-10) = " + calculadora.dividir(-10, -10));
        System.out.println("4. Positivo por Zero: 10 / 10 = " + calculadora.dividir(10, 0));
        System.out.println("5. Negativo por Zero: (-10) / 10 = " + calculadora.dividir(-10, 0));
        System.out.println("6. Zero por Zero: 0 / 0 = " + calculadora.dividir(0, 0));
    }
}
