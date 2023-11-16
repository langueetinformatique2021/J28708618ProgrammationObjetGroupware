package Atelier05;

public class testDate {

	/** point d'entrée d'un exécutable */
	public static void main(String[] args) { 
		// Instanciation de deux objets de type date
		date today = new date(); 
		date dfin = new date();

		today.Afficher(); dfin.Afficher();
		do { today.Incrementer(); today.Afficher(); }
		while (today.CompareTo(dfin));
		}
}
