package Hola;

import java.util.Scanner;

public class CalculadoraDePorcentajes {
	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		double num1, porciento;

		String respu;

		do {

			System.out.println("Bienvenido a tu calculadora de porcentajes");
			System.out.println();

			System.out.print("Introduce el número: ");
			System.out.println();

			num1 = scann.nextDouble();

			System.out.print("Introduce el numero del porcentaje sin % ");
			System.out.println();

			porciento = scann.nextDouble();
			double resultado = 0;

			System.out.println("El porcentaje es:" + (resultado = num1 * porciento / 100) + "%.");

			System.out.println("-------------------------------------------");
			System.out.println("¿Te gustaría operar otra vez? Responde (s/N)");

			scann.nextLine();
			respu = scann.nextLine();
		} while (respu.equals("s"));
		scann.close();
	}
}
