package drivenow.enteties;

import java.util.ArrayList;
import java.util.UUID;

public class Fahrschueler {

	private String name;
	private UUID id;
	private String anschrift;
	private boolean theorie_bestanden;
	private ArrayList<Theoriestunde> theoriestunden;
	private Fahrlehrerindaten fahrlehrerin;
	
	public String getAnschrift() {
		return anschrift;
	}

	public void setAnschrift(String anschrift) {
		this.anschrift = anschrift;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fahrschueler(String name, String anschrift) {
		this.setName(name);
		this.id = UUID.randomUUID();
		this.setAnschrift(anschrift);
	}

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
		int grundlagen = 0;
		for ( Theoriestunde t : theoriestunden){
			if ( t.getThema() < 13) grundlagen++;
		}
		return grundlagen;
		
	}
	
	public boolean sonderthema_besucht(int thema){
		return theorie_bestanden;
		
	}
	
	public void add_stunde(Theoriestunde ts){
		theoriestunden.add(ts);
	}

	public Fahrlehrerindaten getFahrlehrerin() {
		return fahrlehrerin;
	}

	public void setFahrlehrerin(Fahrlehrerindaten fahrlehrerin) {
		this.fahrlehrerin = fahrlehrerin;
	}
	
}
