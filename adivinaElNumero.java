package Hola;

import java.util.Scanner;

public class AdivinaElNumeroPlus {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String respuesta;

		do {
			double numeroDecimales = Math.random() * 100 + 1;
			int numeroAdivinar = (int) numeroDecimales;

			// System.out.println(numeroAdivinar);

			int intentos = 0;
			int intentosMaximos = 3;

			boolean seguir = true;

			while (seguir) {
				System.out.println("Dime un numero entre 1 y 100");

				int numero = sc.nextInt();
				intentos++;

				System.out.println("Intento numero " + intentos);

				if (numero == numeroAdivinar) {
					System.out.println("Enhorabuena, has acertado");

					seguir = false;

				} else if (numeroAdivinar < numero) {
					System.out.println("El número es menor");
				} else {
					System.out.println("El número es mayor");
				}
			}

			System.out.println("¿Te gustaría jugar otra vez? Responde (s/N)");

			sc.nextLine();
			respuesta = sc.nextLine();
		} while (respuesta.equals("s"));

		System.out.println("Gracias por haber jugado");

		sc.close();
	}
}
