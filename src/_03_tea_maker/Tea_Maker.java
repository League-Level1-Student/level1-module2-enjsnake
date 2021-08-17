package _03_tea_maker;

public class Tea_Maker {

	public static void main(String[] args) {
		TeaBag teaBag = new TeaBag("Green");
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		kettle.boil();
		cup.makeTea(teaBag,kettle.getWater());

	}

}
