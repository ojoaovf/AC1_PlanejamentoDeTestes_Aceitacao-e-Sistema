package calculadora;

public class Calculadora {
	// Método para realizar a soma de dois números
	public double somar(int a, int b) {
		return a + b;
	}

	// Método para realizar a subtração de dois números
	public double subtrair(int a, int b) {
		return a - b;
	}

	// Método para realizar a multiplicação de dois números
	public double multiplicar(int a, int b) {
		return a * b;
	}
	
	// Método para realizar a divisão de dois números
	public String dividir(int a, int b) {
		if (b == 0) {
			return "Resultado indefinido.";
		}
		double resultado = (double) a / b;
		return String.valueOf(resultado);
	}
}
