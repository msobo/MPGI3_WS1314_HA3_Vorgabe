package drivenow.controls;

import java.util.ArrayList;

import drivenow.Systemereignis;
import drivenow.Systemereignis.Nachricht;
import drivenow.enteties.Auto;
import drivenow.enteties.Fahrlehrerindaten;
import drivenow.enteties.Fahrschueler;


public class Ressourcenverwaltung {
	
	private ArrayList<Auto> autos = new ArrayList<>();
	private ArrayList<Fahrlehrerindaten> fahrlehrerindaten = new ArrayList<>();	
	private ArrayList<Fahrschueler> fahrschueler = new ArrayList<>();
	
	/**
	 * Diese Methode erstellt eine neue Fahrlehrerin im System.
	 * @param name
	 * @param kennzeichen
	 * @return
	 */
	public Systemereignis fahrlehrerin_hinzufuegen(String name, String kennzeichen) {
		Auto auto = get_auto(kennzeichen);
		if(auto == null){
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefuegt_Auto_unbekannt);
		}
		Fahrlehrerindaten fl = auto.get_fahrlehrerin();
		if(fl != null){
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefuegt_Auto_vergeben);
		}
		Fahrlehrerindaten f_new = new Fahrlehrerindaten(name, auto);
		fahrlehrerindaten.add(f_new);
		auto.set_fahrlehrerin(f_new);
		
		return new Systemereignis(Nachricht.Fahrlehrerin_erfolgreich_hinzugefuegt);

	}
	
	/**
	 * Diese Methode erstellt ein neues Auto im System.
	 * @param kennzeichen
	 * @return
	 */
	public Systemereignis auto_hinzufuegen(String kennzeichen){
		if( get_auto(kennzeichen) != null){
			return new Systemereignis(Nachricht.Auto_mit_kennzeichen_bereits_vorhanden);
		}
		else{
			autos.add(new Auto(kennzeichen));
			return new Systemereignis(Nachricht.Fahrschulauto_erfolgreich_hinzugefuegt);	
		}
	}

	/**
	 * Diese Methode erstellt einen neuen Fahrschueler im System.
	 * @param name
	 * @param anschrift
	 * @return
	 */
	public Systemereignis fahrschuehler_eintragen(String name, String anschrift) {
		Fahrschueler fs = new Fahrschueler(name, anschrift);
		fahrschueler.add(fs);
		return new Systemereignis(Nachricht.Fahrschueler_erfolgreich_hinzugefuegt, fs.get_ID());
	}

	/**
	 * Diese Methode gibt den aktuellen Datensatz in einer lesbarer Art zurueck
	 * @return
	 */
	public String getText() {
		String str = "";
		for ( Auto a : autos ){
			str += "Auto: " + a.get_kennzeichen() + "\n";
		}
		return str;
	}
	
	
	// PRIVATE CLASSES
	private Auto get_auto(String kennzeichen){
		for (Auto a : autos){
			if(a.get_kennzeichen() == kennzeichen ){
				return a;
			}
		}
		return null;
	}

}
