
public class Videojuego implements Entregable {

	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;

	public Videojuego() {

		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horasEstimadas) {

		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {

		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

	@Override
	public boolean entregar() {
		this.entregado = true;
		return this.entregado;
	}

	@Override
	public boolean devolver() {
		this.entregado = false;
		return this.entregado;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	public void compareTo(Serie a) {

		System.out.println(getTitulo() + " tiene " + getHorasEstimadas() + "horas comparado con " + a.getTitulo()
				+ " que tiene " + a.getNumeroTemporadas() + " temporadas");
	}

}
