package Atelier06;

public class Arbre extends Végétal {
	private int hauteur_arbre;
	
	public Arbre(String nom, int hauteur) {
		super(nom);
		this.hauteur_arbre=hauteur;
	}
	
	public void perdreFeuilles() {
		System.out.println("L'arbre perd ses feuilles en automne.");
		
	}
	
}
