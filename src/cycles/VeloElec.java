package cycles;

public class VeloElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec(double diamRoue, double coupleMoteur) {
		super.setDiamRoue(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec() {
		
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		return this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_COUPLE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return this.facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double coupleMoteur) {
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur= " + this.facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * this.facteurPuissanceMoteur;
	}
}
