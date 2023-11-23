package Atelier06;

public abstract class Animal {
	private String espèce;
	private int nb_pattes=0;
	
	public Animal(String type, int pattes) {
		espèce=type;
		nb_pattes=pattes;
	}

	public void présente() {
		System.out.println("je suis un représentant de l'espèce des " +espèce+ " et j'ai " +nb_pattes+ " pattes");
	}
	
	public abstract void crie(); /**méthode non définie*/
}
