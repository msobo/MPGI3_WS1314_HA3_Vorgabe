package src.drivenow;

import java.util.UUID;

public class Fahrlehrerindaten {
	
	private UUID id;
	private String name;
	
	public Fahrlehrerindaten(String name){
		this.name = name;
		this.id = UUID.fromString(name);
	}
	
	public Fahrlehrerindaten create(String name, Auto auto){
		Fahrlehrerindaten fd = new Fahrlehrerindaten(name);
		return fd;
	}
	

}
