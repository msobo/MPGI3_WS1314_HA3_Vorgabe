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
	
	private int get_anzahl_grundlagen(){
		
	
	}
	
	private boolean sonderthema_besucht(int thema){
		
	}
	
	private void add_stunde(Theoriestunde ts){
		
	}
	
}