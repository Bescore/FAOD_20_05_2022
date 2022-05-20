package exercice_2;

import java.util.ArrayList;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
		Scanner scanner = new Scanner(System.in)) {
			int nombreLivre;
			System.out.print("Saisir le nombre de livre: ");
			nombreLivre = scanner.nextInt();
			int stockerLeNombreLivreInitiale=nombreLivre;
			int stockPrixLivre=0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < nombreLivre; i++) {
				System.out.print("donner le titre du livre numéro "+i+": ");
			    String titreLivre = scanner.next();
			    System.out.print("Saisir l'auteur du livre numéro "+i+": ");
			    String auteurLivre = scanner.next();
			    System.out.print("Saisir le prix livre numéro "+i+": ");
			    int prixLivre = scanner.nextInt();
			    list.add(prixLivre);
			    stockPrixLivre+=list.get(i);
			   
			}
			
			System.out.println("le nombre de livre est "+stockerLeNombreLivreInitiale+" et le montant total est : "+stockPrixLivre+" € " );
		}
        
	}

}
