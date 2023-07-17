package s01n01Ex01;

public class Cuerda extends Instrumento {

	public Cuerda(String nombre, double precio) {
		super(nombre, precio);
		
	}

	public String tocar() {
		return "Está sonando un instrumento de cuerda." + " " + super.getNombre() + ", con un precio de " + super.getPrecio() + " euros.";
	}

}
