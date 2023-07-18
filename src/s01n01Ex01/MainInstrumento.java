package s01n01Ex01;

public class MainInstrumento {

	public static void main(String[] args) {
		Viento viento1 = new Viento("Flauta",15);
		Cuerda cuerda1 = new Cuerda("Violin", 500);
		Percusion percusion1 = new Percusion("Tambor",150);
		
		System.out.println(viento1.tocar());
		System.out.println(cuerda1.tocar());
		System.out.println(percusion1.tocar());

	}

}
