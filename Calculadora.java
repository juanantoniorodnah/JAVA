package Hola;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		double num1, num2;

		String operacion;
		String respu;

		do {

			System.out.println("Bienvenido a tu calculadora");
			System.out.println();

			System.out.print("Introduce el primer número: ");
			System.out.println();

			num1 = scann.nextDouble();
			
			System.out.print("Introduce la operación (+, -, *, /): ");
			System.out.println();

			operacion = scann.next();

			System.out.print("Introduce el segundo número: ");
			System.out.println();

			num2 = scann.nextDouble();

			double resultado = 0;
			boolean valido = true;

			switch (operacion) {
			case "+":
				resultado = num1 + num2;
				break;

			case "-":
				resultado = num1 - num2;
				break;

			case "*":
				resultado = num1 * num2;
				break;

			case "/":
				if (num2 != 0) {
					resultado = num1 / num2;

				} else {
					System.out.println("No se puede dividir ente cero.");
					System.out.println();
					valido = false;
				}
				break;

			default:
				System.out.println("Operación no válida.");
				System.out.println();
				valido = false;
				break;
			}

			if (valido) {
				System.out.println("El resultado es: " + resultado + ".");
				System.out.println();
			}
			System.out.println("-------------------------------------------");
			System.out.println("¿Te gustaría operar otra vez? Responde (s/N)");

			scann.nextLine();
			respu = scann.nextLine();
		} while (respu.equals("s"));
		scann.close();
	}
}
