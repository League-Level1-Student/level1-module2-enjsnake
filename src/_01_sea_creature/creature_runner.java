package _01_sea_creature;

public class creature_runner {
	public static void main(String[]Args) {
		SeaCreature spongeBob = new SeaCreature("SpongeBob");
		spongeBob.eat();
		spongeBob.laugh();
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		patrick.getName();
		patrick.eat();
		patrick.laugh();
		squidward.getName();
		squidward.eat();
		squidward.laugh();
	}
}
