package _02_smurf;

public class smurf_runner {
	public static void main(String[]Artgs) {
		Smurf handySmurf = new Smurf("Handy");
		Smurf papaSmurf = new Smurf("Papa");
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(handySmurf.getName());
		handySmurf.eat();
		System.out.println(handySmurf.getHatColor());
		System.out.println(papaSmurf.getName());
		System.out.println(papaSmurf.getGender());
		System.out.println(papaSmurf.getHatColor());
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getGender());
		System.out.println(smurfette.getHatColor());
	}
}
