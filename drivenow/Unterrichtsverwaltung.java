package drivenow;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

public class Unterrichtsverwaltung {
	
	private ArrayList<Fahrschueler> fahrschueler;
	private Theoriestunden_Collection theoriestunden;
	private ArrayList<Fahrlehrerindaten> fahrlehrerindaten;
	
	
	public Systemereignis theoriestunde_vermerken(String schuelerID, Calendar beginn){
		boolean bereits_besucht;
		boolean sonderthema_vermerkt;
		int anzahl_grundlagen;
		int thema;
		
		
		Fahrschueler fs = get_fahrschueler(schuelerID);
		Theoriestunde ts = theoriestunden.get_theoriestunde(beginn);
		bereits_besucht = fs.finde_stunde(ts);
		if(bereits_besucht){
			return new Systemereignis(Systemereignis.Nachricht.Theoriestunde_nicht_vermerkt_bereits_vermerkt);
		}
		if(!bereits_besucht){
			anzahl_grundlagen = fs.get_anzahl_grundlagen();
			thema = ts.getThema();
			
			if(anzahl_grundlagen>=12 && thema<13 ){
				return new Systemereignis(Systemereignis.Nachricht.Theoriestunde_nicht_vermerkt_bereits_genug_Grundlagen);
			}
			
			if(thema>12){
				sonderthema_vermerkt = fs.sonderthema_besucht(thema);
				if(sonderthema_vermerkt){
					return new Systemereignis(Systemereignis.Nachricht.Theoriestunde_nicht_vermerkt_bereits_Sonderthema);
				}
			}
			
			fs.add_stunde(ts);
			
		}
		return new Systemereignis(Systemereignis.Nachricht.Theoriestunde_erfolgreich_vermerkt);
	}


	private Fahrschueler get_fahrschueler(String schuelerID){
		for(int i = 0; i<fahrschueler.size();i++){
			if(fahrschueler.get(i).get_ID().toString()==schuelerID){
				return fahrschueler.get(i);
			}
		}
		return null;
		
	}
	
	private void add(Fahrlehrerindaten f_new){
		fahrlehrerindaten.add(f_new);
	}
}
