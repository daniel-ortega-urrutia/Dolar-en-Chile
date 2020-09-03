package modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



public class Dolar {
	public String version;
	public String autor;
	public String codigo;
	public String nombre;
	public String unidad_medida;
	public ArrayList<Serie> serie;;// el JSON devuelve una list de tipo Serie

//	CONSTRUCTOR SIN PARAMETROS
	public Dolar() {

	}

//	CONSTRUCTOR CON PARAMETROS
	public Dolar(String version, String autor, String codigo, String nombre, String unidad_medida,
			ArrayList<Serie> serie) {
		super();
		this.version = version;
		this.autor = autor;
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidad_medida = unidad_medida;
		this.serie = serie;
	}

//	GETTERS AND SETTERS 
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUnidad_medida() {
		return unidad_medida;
	}

	public void setUnidad_medida(String unidad_medida) {
		this.unidad_medida = unidad_medida;
	}

	public ArrayList<Serie> getSerie() {
		return serie;
	}

	public void setSerie(ArrayList<Serie> serie) {
		this.serie = serie;
	}

//	METODO TO STRING
	@Override
	public String toString() {
		return "Dolar \nVersion: " + version + "\nAutor: " + autor + "\nCodigo: " + codigo + "\nNombre: " + nombre
				+ "\nUnidad medida: " + unidad_medida + "\nSerie=" + serie + "\n";
	}

//	METODO QUE DEVOLVERA UNA LISTA CON EL DOLAR OBSERVADO
	List<Dolar> obtenerDolar() {
//		CREAMOS UN NUEVO ARRAY LIST PARA AGREGAR LOS DATOS, LO INICIALIZAMOS EN VACIO
		List<Dolar> dolarObservado = new ArrayList<Dolar>();
//    	crear una instancia de un cliente
		Client client = ClientBuilder.newClient();
//		Una vez que se tiene la instancia del Cliente, se puede crear un WebTarget utilizando el URI del recurso
//		web objetivo, en este caso es la ruta: https://jsonplaceholder.typicode.com/posts . De la cual
//		obtendremos las publicaciones (posts).
		WebTarget target = client.target("https://mindicador.cl/api/").path("dolar");
//		Se crea un generador de invocación de instancias con uno de los métodos de Jersey llamado
//		WebTarget.request():
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
//		Invocando GET, para consumir API. Método GET usado para obtener un recurso.
		Response respuestaDolar = invocationBuilder.get();
//		Para leer la respuesta y asignarla a una propiedad, se debe llamar al método readEntity.
		Dolar dolar = respuestaDolar.readEntity(new GenericType<Dolar>() {
		});
//		DESPUES DE ASIGNARLE A UNA VARIABLE 'DOLAR' DE TIPO DOLAR LOS VALORES, 
//		AGREGAMOS LOS VALORES AL ARREGLO
		dolarObservado.add(dolar);
//		retornamos la lista con los valores del dolar observado
		return dolarObservado;
	}
	
//	METODO QUE DEVULVE EL VALOR DEL DOLAR OBSERVADO EN EL DIA ACTUAL
	public void dolarObservadoActual(List<Dolar>listaDolar) {
		List<Double>dolarHoy = new ArrayList<>();
		for (int i = 0; i < listaDolar.size(); i++) {
			dolarHoy.add(listaDolar.get(0).getSerie().get(0).getValor());
		}
		System.out.println("El valor del dolar observado: "+dolarHoy.toString()+"\n");
	}
	
}
