package drivenow;

import java.util.UUID;

public class Fahrschueler {

	private String name;
	private UUID id;
	private String anschrift;
	private boolean theorie_bestanden;
	private Theoriestunden_Collection theoriestunden;
	
	public UUID get_ID(){
		return this.id;
	}
	
	public boolean finde_stunde(Theoriestunde ts){
		if(theoriestunden.contains(ts)){
			return true;
		}
		return false;
	}
	
	public int get_anzahl_grundlagen(){
		return theoriestunden.get_anzahl_grundlagenstunden();
	}
	
	public boolean sonderthema_besucht(int thema){
		return theoriestunden.finde_stunde(thema);
		
	}
	
	public void add_stunde(Theoriestunde ts){
		theoriestunden.add(ts);
	}
	
}
