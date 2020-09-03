package modelo;

import java.util.List;

import menu.Menus;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*
		 * Proyecto construido en Maven con fines autodidactas para fortalecer el
		 * aprendizaje
		 */
		Dolar dolar = new Dolar();// INSTNCIAMOS LA CLASE
		List<Dolar> listaDolar = dolar.obtenerDolar();// DE LA INSTANCIA OCUPAMOS EL METODO OBTENER DOLAR,

		String opcion;
		do {
			opcion = Menus.menuPrinicipal();
			if (opcion.equals("1")) {
				dolar.dolarObservadoActual(listaDolar);
			}
			if (opcion.equals("2")) {
				System.out.println(listaDolar);
			}

		} while (!opcion.equalsIgnoreCase("salir"));

	}

}
