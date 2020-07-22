package modelo;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*
		 Proyecto construido en Maven
		 con fines autodidactas para fortalecer el aprendizaje
		 */

		Dolar dolar = new Dolar();// INSTNCIAMOS LA CLASE
		List<Dolar> listaDolar = dolar.obtenerDolar();// DE LA INSTANCIA OCUPAMOS EL METODO OBTENER DOLAR,
//    	RETORNA DOLAR OBSERVADO
//    	IMPRIMIMOS EL DOLAR OBSERVADO
		System.out.println(listaDolar);

	}
}
