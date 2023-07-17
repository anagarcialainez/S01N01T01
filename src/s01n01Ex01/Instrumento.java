package s01n01Ex01;

public abstract class Instrumento {

	public static void main(String[] args) {
		Viento viento1 = new Viento("Flauta",15);
		Cuerda cuerda1 = new Cuerda("Violin", 500);
		Percusion percusion1 = new Percusion("Tambor",150);
		
		System.out.println(viento1.tocar());
		System.out.println(cuerda1.tocar());
		System.out.println(percusion1.tocar());
	}
	
	//atributos
	private String nombre;
	private double precio;
	
	//constructor
	public Instrumento(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//metodos
	public abstract String tocar();

}
/*En un grupo de música existen diferentes tipos de instrumentos musicales. 
 * Hay instrumentos de viento, cuerda y percusión.
 * Todos los instrumentos tienen como atributos su nombre y precio. 
 * Además, tienen un método llamado tocar(). Éste es abstracto en la clase instrumento y, por tanto,
 *debe implementarse en las clases hijas. Si se está tocando un instrumento de viento,
 * el método debe mostrar por consola: "Está sonando un instrumento de viento", 
 * si se está tocando un instrumento de cuerda: "Está sonando un instrumento de cuerda" 
 * y si se está tocando un instrumento de percusión: "Está sonando un instrumento de percusión".
 * El proceso de carga de una clase sólo tiene lugar una vez. 
 * Demuestra que la carga puede ser provocada por la creación de la primera instancia de esta clase o 
 * por el acceso a un miembro estático de ésta.
 * Buscar información sobre los blogs de inicialización y blogs estáticos en Java. */
