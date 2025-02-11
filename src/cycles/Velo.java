package cycles;

import java.util.Random;

public class Velo {
	// ===== Attributes =====
	private double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	
	// ===== Methods =====
	public double getDEFAUT_BRAQUET() {
		return this.DEFAUT_BRAQUET;
	}
	public void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		this.DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	// ===== Constructor =====
	Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	Velo(double braquet) {
		this.braquet = braquet;
	}
	Velo() {
		
	}
	
	// ===== Methods =====
	public Random getGenAlea() {
		return this.genAlea;
	}
	public void setGenAlea(Random genAlea) {
		genAlea = new Random();
		this.genAlea = genAlea;
	}
	
	public double getBraquet() {
		return this.braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	@Override
	public String toString() {
		return "Velo [braquet= " + this.braquet + ", diamRoue= " +this.diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * this.braquet * this.diamRoue * genAlea.nextDouble();
	}
	
}
