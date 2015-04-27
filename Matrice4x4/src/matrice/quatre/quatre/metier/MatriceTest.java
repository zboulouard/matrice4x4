package matrice.quatre.quatre.metier;

import matrice.quatre.quatre.entity.Auteur;

public class MatriceTest {

	private int[][] matrice = new int[4][4];
	private Auteur[] listeAuteurs = new Auteur[4];
	private int max = Integer.MIN_VALUE;
	
	public void createMatrice() {
		listeAuteurs = createAuteurs(listeAuteurs);
		for(int i=0; i<matrice.length; i++) {
			for(int j=0; j<matrice[i].length; j++) {
				matrice[i][j] = i+j;
				if(matrice[i][j]>max) {
					max = matrice[i][j];
					listeAuteurs[i].setPoids(max);
				}
			}
		}
	}
	
	public void showMatrice() {
		for(int i=0; i<matrice.length; i++) {
			for(int j=0; j<matrice.length; j++) {
				System.out.print(matrice[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	
	public Auteur[] createAuteurs(Auteur[] listeAuteurs) {
		listeAuteurs = new Auteur[4];
		Auteur a1 = new Auteur("zakaria", 0);
		Auteur a2 = new Auteur("amine", 0);
		Auteur a3 = new Auteur("anass", 0);
		Auteur a4 = new Auteur("bernard", 0);
		listeAuteurs[0] = a1;
		listeAuteurs[1] = a2;
		listeAuteurs[2] = a3;
		listeAuteurs[3] = a4;
		return listeAuteurs;
	}
	
	public void showAuteurs() {
		for(int i=0; i<listeAuteurs.length; i++) {
			System.out.println("Le poids de : " + listeAuteurs[i].getNom() + " est : " + listeAuteurs[i].getPoids());
		}
	}
	
	public void organizeAuteurs() {
		Calculs c1 = new Calculs();
		for(int i=0; i<listeAuteurs.length; i++) {
			System.out.println("\n************* Itération " + i + "*************");
			for(int j=0; j<listeAuteurs.length; j++) {
				if(i==j) {
					continue;
				} else {
					listeAuteurs[i].setIndex(i);
					listeAuteurs[j].setIndex(j);
					double force = c1.force(listeAuteurs[i], listeAuteurs[j], matrice);
					listeAuteurs[j].setA(listeAuteurs[j].getA() + force);
					listeAuteurs[j].setB(listeAuteurs[j].getB() + force);
					listeAuteurs[j].setC(listeAuteurs[j].getC() + force);
					System.out.println("Nouvelles coodronnées de " + listeAuteurs[j].getNom() + " sont : " + "(" + listeAuteurs[j].getA() + ", " + listeAuteurs[j].getB() + ", " + listeAuteurs[j].getC() + ")");
				}
				
				
			}
		}
	}

	public Auteur[] getListeAuteurs() {
		return listeAuteurs;
	}

	public void setListeAuteurs(Auteur[] listeAuteurs) {
		this.listeAuteurs = listeAuteurs;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
}
