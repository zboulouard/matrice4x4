package matrice.quatre.quatre.metier;

import matrice.quatre.quatre.entity.Auteur;

public class Calculs {
	
	private double dist0 = 20;

	public double distanceAbsolue(Auteur au1, Auteur au2) {
		double distAbs = Math.abs(au1.getA()-au2.getA()) + Math.abs(au1.getB()-au2.getB()) + Math.abs(au1.getC()-au2.getC());
		System.out.println("Distance Absolue entre " + au1.getNom() + " et " + au2.getNom() + " est : " + distAbs);
		return distAbs;
	}
	
	public double distanceEuclidienne(Auteur au1, Auteur au2) {		
		double sommeCarres = Math.pow(au1.getA()-au2.getA(), 2) + Math.pow(au1.getB()-au2.getB(), 2) + Math.pow(au1.getC()-au2.getC(), 2);
		double distEuc = Math.sqrt(sommeCarres);
		//System.out.println("Distance Euclidienne entre " + au1.getNom() + " et " + au2.getNom() + " est : " + distEuc);
		return distEuc;
	}
	
	public double force(Auteur au1, Auteur au2, int[][] matrice) {
		
		double repulsion = -(distanceEuclidienne(au1, au2)/dist0);
		double volonte = matrice[au1.getIndex()][au2.getIndex()]/au1.getPoids();
		double attractivite = au2.getPoids()/(au1.getPoids()+au2.getPoids());
		double distRel = distanceEuclidienne(au1, au2)/dist0 - 1;
		
		double force = repulsion + volonte*attractivite*(distRel + Math.pow(distRel, 3));
		
		return force;
		
	}
	
}
