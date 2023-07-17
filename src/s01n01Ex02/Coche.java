package s01n01Ex02;

public class Coche {

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		//solo se puede establecer el modelo, ya que los otros 2 atributos son constantes (final).
		coche1.setModelo("Barcelona");
		System.out.println("Coche de la marca: " + coche1.getMarca() + ", modelo: " + coche1.getModelo() +" y potencia: " + coche1.getPOTENCIA() + " HP." );
		
		Coche coche2 = new Coche();
		coche2.setModelo("Mayorca");
		System.out.println("Coche de la marca: " + coche2.getMarca() + ", modelo: " + coche2.getModelo() +" y potencia: " + coche2.getPOTENCIA() + " HP." );
		
		//llamando a un metodo estatico
		System.out.println(Coche.frenar()); //no es necesario crear el objeto , se llama desde el nombre de la clase
		
		
		//llamando a un metodo no estatico
		System.out.println(coche1.acelerar());
		//Coche.acelerar(); //no se puede
	}
	
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
