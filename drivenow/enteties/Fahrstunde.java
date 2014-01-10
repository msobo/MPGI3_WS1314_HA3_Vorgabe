package drivenow.enteties;

import java.util.Date;

import drivenow.interfaces.ISekretaerBoundary.Stundenart;

public class Fahrstunde extends Unterricht{

	private Stundenart art;
	
	public Fahrstunde(Date beginn, Stundenart art) {
		super(beginn);
		this.setArt(art);
	}

	public Stundenart getArt() {
		return art;
	}

	public void setArt(Stundenart art) {
		this.art = art;
	}

}
