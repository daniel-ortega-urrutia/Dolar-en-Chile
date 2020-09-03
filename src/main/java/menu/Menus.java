package menu;

import java.util.Scanner;

public class Menus {
	
	public static String menuPrinicipal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1-Mostrar valor actual");
		System.out.println("2-Listar valores dias anteriores");
		System.out.println("escriba 'Salir' para terminar el programa");
		String opcion = sc.nextLine();
		return opcion;
	}

	
}
