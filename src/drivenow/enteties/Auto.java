package drivenow.enteties;

import drivenow.Fahrlehrerindaten;

public class Auto {
	
	private String kennzeichen;
	private Fahrlehrerindaten fahrlehrerin;
	
	public Auto(String kennzeichen){
		this.kennzeichen = kennzeichen;
	}

	public String get_kennzeichen(){
		return this.kennzeichen;
	}
	
	public Fahrlehrerindaten get_fahrlehrerin(){
		return this.fahrlehrerin;
	}
	
	public void set_fahrlehrerin(Fahrlehrerindaten f_new){
		this.fahrlehrerin = f_new;
	}
}
