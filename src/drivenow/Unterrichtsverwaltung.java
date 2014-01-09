package drivenow;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

public class Unterrichtsverwaltung {
	
	private ArrayList<Fahrschueler> fahrschueler;
	private Theoriestunden_Collection theoriestunden;
	private ArrayList<Fahrlehrerindaten> fahrlehrerindaten;
	
	
	//statt date Calendar oder so?
	public void theoriestunde_vermerken(String schuelerID, Date beginn){
		Fahrschueler fs = get_fahrschueler(schuelerID);
		Theoriestunde ts = theoriestunden.get_theoriestunde(beginn);
		
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
