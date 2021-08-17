package _99_extra;

public class PixelPartyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PixelParty party = new PixelParty();
		party.setColor(0, 200, 255);
		party.drawCircle(5, 0, 0);
		party.drawTriangle(5, 5, 5, 5, 5, 5);
		party.drawRectangle(100, 500, 1, 30);
		party.saveImage();
		party.displayImage();
	}

}
