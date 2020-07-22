package modelo;

public class Serie {
	public String fecha;
	public double valor;

//    CONSTRUCTOR SIN PARAMETROS
	public Serie() {

	}

//	CONSTRUCTOR CON PARAMETROS
	public Serie(String fecha, double valor) {
		super();
		this.fecha = fecha;
		this.valor = valor;
	}

//	GETTERS AND SETTERS 
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

//	METODO TO STRING
	@Override
	public String toString() {
		return "Serie \nFecha: " + fecha + "\nValor:" + valor + "\n";
	}

}
