package drivenow.enteties;

import java.util.Date;

public class Theoriestunde extends Unterricht{
	
	private int thema;
	
	public int getThema() {
		return thema;
	}
	
	public Theoriestunde(int thema, Date beginn){
		super(beginn);
		this.thema = thema; 
	}

}
