package drivenow;

public class Auto {
	
	private String kennzeichen;
	private Fahrlehrerindaten fahrlehrerin;

	
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
