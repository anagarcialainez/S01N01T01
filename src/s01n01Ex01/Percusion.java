package s01n01Ex01;

public class Percusion extends Instrumento {

	public Percusion(String nombre, double precio) {
		super(nombre, precio);
		
	}

	public String tocar() {
		return "Está sonando un instrumento de percusión." + " " + super.getNombre() + ", con un precio de " + super.getPrecio() + " euros.";
	}

}
