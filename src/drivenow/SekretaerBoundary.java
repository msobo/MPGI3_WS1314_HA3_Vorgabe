package drivenow;

import java.util.Date;

import drivenow.interfaces.ISekretaerBoundary;

public class SekretaerBoundary implements ISekretaerBoundary {

	@Override
	public Systemereignis fahrlehrerinEintragen(String name, String kennzeichen) {
		
		
		return null;
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
