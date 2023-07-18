package s01n01Ex02;

public class MainCoche {

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

}
