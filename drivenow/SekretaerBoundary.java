package drivenow;

import java.util.Date;

import drivenow.Systemereignis;
import drivenow.controls.Ressourcenverwaltung;
import drivenow.controls.Unterrichtsverwaltung;
import drivenow.interfaces.ISekretaerBoundary;

public class SekretaerBoundary implements ISekretaerBoundary {
	
	Ressourcenverwaltung ressourceVerwaltung = new Ressourcenverwaltung();
	Unterrichtsverwaltung unterrichtsVerwaltung = new Unterrichtsverwaltung();

	@Override
	public Systemereignis fahrlehrerinEintragen(String name, String kennzeichen) {
		return ressourceVerwaltung.fahrlehrerin_hinzufuegen(name, kennzeichen);
	}

	@Override
	public Systemereignis fahrschuelerEintragen(String name, String anschrift) {
		unterrichtsVerwaltung.fahrschuehler_eintragen(name, anschrift);
		return ressourceVerwaltung.fahrschuehler_eintragen(name, anschrift);
	}

	@Override
	public Systemereignis fahrschulautoEintragen(String kennzeichen) {
		return ressourceVerwaltung.auto_hinzufuegen(kennzeichen);
	}

	@Override
	public Systemereignis theoriestundeEintragen(int thema, Date beginn) {
		return unterrichtsVerwaltung.theoriestunde_erstellen(thema, beginn);
	}

	@Override
	public Systemereignis fahrstundeEintragen(String schuelerID,
			Stundenart art, Date beginn, int anzahl) {
		return unterrichtsVerwaltung.fahrstunde_erstellen(schuelerID, art, beginn, anzahl);
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
		return ressourceVerwaltung.getText() + unterrichtsVerwaltung.getText();
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
