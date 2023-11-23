package Atelier06;

public class Félin extends Animal{
	protected boolean domestique=false;
	
	public Félin(String type) {
		super(type,4);
	}
			
	public void présente() {
		super.présente();
		String etat=(domestique)? "domestique":"sauvage";
		System.out.println("je suis vraiment un animal " + etat);
	}

	public void crie() {
		System.out.println("je crie donc je suis vivant");
	}
}
