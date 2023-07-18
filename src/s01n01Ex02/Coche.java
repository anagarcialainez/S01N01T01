package s01n01Ex02;

public class Coche {

	private static final String MARCA = "SEAT";
	private static String modelo;
	private final int POTENCIA = 105;
	
	//Constructor
	
	//getters y setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public String getMarca() {
		return MARCA;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}

	//metodo estatico
	public static String frenar(){
		return "El vehiculo esta frenando";
	}
	
	//metodo no estatico
	public String acelerar() {
		return "El vehiculo esta acelerando";
	}
}

/*Crea una clase "Coche" con los atributos: marca, modelo y potencia. La marca debe ser estático final, 
 * el modelo estático y la potencia final. Demuestra la diferencia entre los tres. 
 * ¿Hay alguno que pueda inicializarse al constructor de la clase? Añade dos métodos a la clase "Coche". 
 * Un método estático llamado frenar() y otro no estático llamado acelerar(). 
 * El método acelerar debe mostrar por consola: "El vehículo está acelerando" y el método frenar() debe mostrar:
 *  "El vehículo está frenando".
 *  Demuestra cómo invocar el método estático y el no estático desde el main() de la clase principal. */
