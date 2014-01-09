package drivenow.enteties;

import java.util.UUID;

import drivenow.Theoriestunden_Collection;

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
		return 0;
		
	}
	
	private boolean sonderthema_besucht(int thema){
		return theorie_bestanden;
		
	}
	
	private void add_stunde(Theoriestunde ts){
		theoriestunden.add(ts);
	}
	
}
