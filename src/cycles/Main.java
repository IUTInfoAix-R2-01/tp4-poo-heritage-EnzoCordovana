package cycles;

public class Main {
	public static void main(String[] args) {
		Velo monVelo = new Velo(2.0, 1.0);
		
		System.out.println(monVelo.getBraquet());
		System.out.println(monVelo.getDEFAUT_BRAQUET());
		System.out.println(monVelo.getGenAlea());
		System.out.println(monVelo.getPuissance(10.0));
		System.out.println(monVelo);
	}
}
