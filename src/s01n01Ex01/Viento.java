package s01n01Ex01;

public class Viento extends Instrumento {

	public Viento(String nombre, double precio) {
		super(nombre, precio);
	}

	public String tocar() {
		return "Está sonando un instrumento de viento." + " " + super.getNombre() + ", con un precio de " + super.getPrecio() + " euros." ;
	}

}
