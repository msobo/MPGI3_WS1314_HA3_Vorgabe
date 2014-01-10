package drivenow.controls;


import java.util.ArrayList;
import java.util.Date;

import drivenow.Systemereignis;
import drivenow.Systemereignis.Nachricht;
import drivenow.enteties.Fahrlehrerindaten;
import drivenow.enteties.Fahrschueler;
import drivenow.enteties.Fahrstunde;
import drivenow.enteties.Theoriestunde;
import drivenow.enteties.Unterricht;
import drivenow.interfaces.ISekretaerBoundary.Stundenart;

public class Unterrichtsverwaltung {
	
	private ArrayList<Fahrschueler> fahrschueler = new ArrayList<>();
	private ArrayList<Fahrlehrerindaten> fahrlehrerindaten = new ArrayList<>();
	private ArrayList<Theoriestunde> theoriestunden = new ArrayList<>();
	private ArrayList<Unterricht> fahrstunden = new ArrayList<>();
	
	
	/**
	 * Diese Methode erstellt eine neue Fahrstunde im System.
	 * @param thema
	 * @param beginn
	 * @return
	 */
	public Systemereignis theoriestunde_erstellen(int thema, Date beginn){
		theoriestunden.add(new Theoriestunde(thema, beginn));
		return new Systemereignis(Nachricht.Theoriestunde_erfolgreich_hinzugefuegt);
	}
	
	/**
	 * Diese Methode vermerkt den Besuch einer Theoriestunde fuer einen
	 * Schueler.
	 * @param schuelerID
	 * @param beginn
	 * @param anzahl
	 * @return 
	 */
	public Systemereignis theoriestunde_vermerken(String schuelerID, Date beginn, int anzahl){
		Fahrschueler fs = get_fahrschueler(schuelerID);
		Theoriestunde ts = null;
		for (Theoriestunde t : theoriestunden){
			if ( t.getBeginn() == beginn) ts = t;
		}
		boolean bereits_besucht = fs.finde_stunde(ts);
		if(bereits_besucht){
			return new Systemereignis(Nachricht.Theoriestunde_nicht_vermerkt_bereits_vermerkt);
		}		
		else{
			int anzahl_grundlagen = fs.get_anzahl_grundlagen();
			int thema = ts.getThema();
			if(anzahl_grundlagen>=12 && thema<13 ){
				return new Systemereignis(Systemereignis.Nachricht.Theoriestunde_nicht_vermerkt_bereits_genug_Grundlagen);
			}
			if(thema>12){
				if(fs.sonderthema_besucht(thema)){
					return new Systemereignis(Systemereignis.Nachricht.Theoriestunde_nicht_vermerkt_bereits_Sonderthema);
				}
			}
			fs.add_stunde(ts);
			return new Systemereignis(Nachricht.Theoriestunde_erfolgreich_vermerkt);
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
		for ( Fahrlehrerindaten fl : fahrlehrerindaten){
		}
		fahrschueler.add(fs);
		return new Systemereignis(Nachricht.Fahrschueler_erfolgreich_hinzugefuegt, fs.get_ID());
	}
	
	/**
	 * Diese Methode erstellt eine neue Fahrstunde im System.
	 * @param schuelerID
	 * @param art
	 * @param beginn
	 * @param anzahl
	 * @return
	 */
	public Systemereignis fahrstunde_erstellen(String schuelerID, Stundenart art, Date beginn,
			int anzahl) {
		for (int i = 0; i < anzahl; i++){
			fahrstunden.add(new Fahrstunde(beginn, art));
		}
		return new Systemereignis(Nachricht.Fahrstunde_erfolgreich_eingetragen);
	}
	
	/**
	 * Diese Methode gibt den aktuellen Datensatz in einer lesbarer Art zurueck
	 * @return
	 */
	public String getText() {
		String str = "";
		for ( Fahrschueler f : fahrschueler ){
			str += "Fahrschueler: " + f.getName() + " wohnhaft in: " + f.getAnschrift();
		}
		return str;
	}
	
	
	// PRIVATE CLASSES
	private Fahrschueler get_fahrschueler(String schuelerID){
		for(Fahrschueler f : fahrschueler){
			if(f.get_ID().toString()==schuelerID){
				return f;
			}
		}
		return null;
		
	}
}
