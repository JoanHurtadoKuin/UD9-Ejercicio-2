
public class mainApp {

	public static void main(String[] args) {

		final int TAMAÑO = 5;

		//Variables
		Serie series[] = new Serie[TAMAÑO];
		Videojuego videojuego[] = new Videojuego[TAMAÑO];
		int auxVideojuegos = 0;
		int auxSeries = 0;

		for (int i = 0; i < TAMAÑO; i++) {
			series[i] = new Serie("serie" + i, "Pepito");
			videojuego[i] = new Videojuego("videojuego" + i, 20 * (i + 1));
		}

		String pelicula = "BATMAN";
		
	
		//Asignamos a estas series entregado
		series[2].entregar();
		series[3].entregar();
		videojuego[0].entregar();
		videojuego[1].entregar();

		//Bucle para mostrar los entregados
		for (int i = 0; i < TAMAÑO; i++) {
			if (series[i].isEntregado()) {
				System.out.println(series[i]);
			}

			if (videojuego[i].isEntregado()) {
				System.out.println(videojuego[i]);
			}
		}

		//Compare Horas de videojuegos con temporadas de Series
		for (int i = 0; i < videojuego.length; i++) {
			videojuego[i].compareTo(series[i]);
		}
		
		for (int i = 0; i < videojuego.length; i++) {
			int max = 0;
			
			
			if(videojuego[i].getHorasEstimadas() > max) {
				auxVideojuegos = i;
			}
		}
		
		for (int i = 0; i < videojuego.length; i++) {
			int max = 0;
			
			//Si las horas del videojuego son mas grandes a max
			if(videojuego[i].getHorasEstimadas() > max) {
				max = videojuego[i].getHorasEstimadas(); //Se guarda un nuevo max
				auxVideojuegos = i; //Se guarda la posicion de la matriz
			}
		}
		
		//Si la serie tiene mas temporadas que max
		for (int i = 0; i < series.length; i++) {
			int max = 0;
			
			if(series[i].getNumeroTemporadas() > max) {
				max = videojuego[i].getHorasEstimadas();//Se guarda un nuevo max
				auxSeries = i; //Se guarda la posicion en la matriz
			}
		}
		
		//toString De los Maxs
		System.out.println(videojuego[auxVideojuegos]);
		System.out.println(series[auxSeries]);
		
		
	}

}
