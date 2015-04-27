package matrice.quatre.quatre.entity;

import java.util.Random;

public class Auteur {
	
	private String nom;
	private int poids;
	private double a;
	private double b;
	private double c;
	private int index;
	public Auteur() {
		super();
		coordGenerator();
	}
	public Auteur(String nom) {
		super();
		this.nom = nom;
		coordGenerator();
	}
	public Auteur(int poids) {
		super();
		this.poids = poids;
		coordGenerator();
	}
	public Auteur(String nom, int poids) {
		super();
		this.nom = nom;
		this.poids = poids;
		coordGenerator();
	}
	private void coordGenerator() {
		Random randomno = new Random();  
		this.a = 100 * randomno.nextDouble();
		this.b = 100 * randomno.nextDouble();
		this.c = 100 * randomno.nextDouble();
		System.out.println("Coodronnées de " + this.getNom() + " sont : " + "(" + this.getA() + ", " + this.getB() + ", " + this.getC() + ")");
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

}
