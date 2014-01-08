package src.drivenow;

import java.util.ArrayList;
import java.util.Date;

import src.drivenow.interfaces.ISekretaerBoundary;


public class Ressourcenverwaltung implements ISekretaerBoundary {
	
	private ArrayList<Auto> autos = null;
	private ArrayList<Fahrlehrerindaten> fahrlehrerindaten = null;
	private Unterrichtsverwaltung unterrichtsverwaltung;
	
	
	
	private Auto get_auto(String kennzeichen){
		for (int i=0; i<autos.size(); i++){
			if(autos.get(i).get_kennzeichen() == kennzeichen ){
				return autos.get(i);
			}
		}
		
		return null;
	}
	
	private void add(Fahrlehrerindaten f_new){
		
	}

	
	
	@Override
	public Systemereignis fahrlehrerinEintragen(String name, String kennzeichen) {
		Auto auto = get_auto(kennzeichen);
		if(auto == null){
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefügt_Auto_unbekannt);
		}
		Fahrlehrerindaten fl = auto.get_fahrlehrerin();
		if(fl != null){
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefügt_Auto_vergeben);
		}
		Fahrlehrerindaten f_new = new Fahrlehrerindaten();
		f_new.create(name,auto);
		
		
		return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_erfolgreich_hinzugefuegt);

	}

	@Override
	public Systemereignis fahrschuelerEintragen(String name, String anschrift) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Systemereignis fahrschulautoEintragen(String kennzeichen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Systemereignis theoriestundeEintragen(int thema, Date beginn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Systemereignis fahrstundeEintragen(String schuelerID,
			Stundenart art, Date beginn, int anzahl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Systemereignis theoriestundeVermerken(String schuelerID, Date beginn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Systemereignis fahrstundeLoeschen(String schuelerID, Date beginn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String datenbestandZurueckgeben() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Systemereignis theoriepruefungszulassungUeberpruefen(
			String schuelerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Systemereignis theoriepruefungsbestehenEintragen(String schuelerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Systemereignis praxispruefungEintragen(String schuelerID, Date beginn) {
		// TODO Auto-generated method stub
		return null;
	}

}
