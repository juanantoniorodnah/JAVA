package Hola;

import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		String palabraOculta = "ipartek";
		StringBuilder palabraVisible = new StringBuilder("_".repeat(palabraOculta.length()));
		int intentosMax = 5;
		String resp;

		System.out.println("Bienvenido al juego del Ahorcado");

		do {
			while (intentosMax > 0 && palabraVisible.toString().contains("_")) {
				System.out.println("Palabra: " + palabraVisible);
				System.out.println();
				System.out.println("Tienes " + intentosMax + " intentos restantes.");
				System.out.println();
				System.out.print("Adivina una letra: ");
				System.out.println();
				char letra = sca.nextLine().charAt(0);
				boolean acierto = false;

				for (int i = 0; i < palabraOculta.length(); i++) {
					if (palabraOculta.charAt(i) == letra) {
						palabraVisible.setCharAt(i, letra);
						acierto = true;
					}
				}

				if (!acierto) {
					intentosMax--;
					System.out.println("¡Letra incorrecta!");
					System.out.println();
				} else {
					System.out.println("¡Correcto!");
					System.out.println();
				}
			}

			if (palabraVisible.toString().equals(palabraOculta)) {
				System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraOculta + ".");
				System.out.println();
			} else {
				System.out.println("¡Perdiste! La palabra era: " + palabraOculta + ".");
				System.out.println();
			}

			System.out.println("-------------------------------------------");
			System.out.println("¿Te gustaría jugar otra vez? Responde (s/N)");

			sca.nextLine();
			resp = sca.nextLine();
		} while (resp.equals("s"));
		sca.close();
	}
}
