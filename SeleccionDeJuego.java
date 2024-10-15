package Hola;

import java.util.Scanner;

public class SeleccionDeJuego {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean opcion = true;

		while (opcion) {

			System.out.println("Juegos");
			System.out.println("--------");
			System.out.println("1. Adivina el numero");
			System.out.println("2. Ahorcado");
			System.out.println("3. Calculadora");
			System.out.println("4. Calculadora de porcentajes");
			System.out.println("5. Juego 5");
			System.out.println();
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Dime cúal de estas opciones vas a elegir.");
			System.out.println();

			int numero = scan.nextInt();

			if (numero == 1) {
				Hola.AdivinaElNumeroPlus.main(args);

			} else if (numero == 2) {
				Hola.Ahorcado.main(args);

			} else if (numero == 3) {
				Hola.Calculadora.main(args);
				
			} else if (numero == 4) {
				Hola.CalculadoraDePorcentajes.main(args);

			} else if (numero == 0) {
				System.out.println("Gracias por estar aqui");

				opcion = false;

			} else {
				System.out.println();
				System.out.println("Aun no tenemos ese juego disponible, selecciona los números 1, 2, 3 o 4");
				System.out.println();
			}
		}
		scan.close();
	}
}
