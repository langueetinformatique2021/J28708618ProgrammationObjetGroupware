package Atelier06;

public class Peuplier extends Arbre {
	private boolean tremble;
	
	public Peuplier(String nom, int hauteur, boolean tremble) {
		super(nom,hauteur);
		this.tremble=tremble;
	}
	
	public void produireFloraison() {
		System.out.println("Le peuplier produit une floraison légère.");
	}

}
