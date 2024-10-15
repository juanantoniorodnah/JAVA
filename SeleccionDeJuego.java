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
			System.out.println("3. Juego 3");
			System.out.println("4. Juego 4");
			System.out.println("5. Juego 5");
			System.out.println();
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Dime que juego te apetecería jugar.");
			System.out.println();

			int numero = scan.nextInt();
			
			if (numero == 1) {
				Hola.AdivinaElNumeroPlus.main(args);
				
			} else if (numero == 2) {
				Hola.Ahorcado.main(args);

			} else if (numero == 0) {
				System.out.println("Gracias por estar aqui");

				opcion = false;

			} else {
				System.out.println();
				System.out.println("Aun no tenemos ese juego disponible, juegue al número 1 o 2");
				System.out.println();
			}
		}

		scan.close();
	}
}
