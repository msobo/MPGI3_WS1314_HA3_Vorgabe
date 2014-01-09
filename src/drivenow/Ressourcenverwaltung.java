package drivenow;

import java.util.ArrayList;

import drivenow.Systemereignis.Nachricht;
import drivenow.enteties.Auto;





public class Ressourcenverwaltung {
	
	private ArrayList<Auto> autos = new ArrayList<>();
	private ArrayList<Fahrlehrerindaten> fahrlehrerindaten = new ArrayList<>();
	private Unterrichtsverwaltung unterrichtsverwaltung;
	
	
	
	private Auto get_auto(String kennzeichen){
		for (Auto a : autos){
			if(a.get_kennzeichen() == kennzeichen ){
				return a;
			}
		}
		return null;
	}

	public Systemereignis fahrlehrerin_hinzufuegen(String name, String kennzeichen) {
		Auto auto = get_auto(kennzeichen);
		if(auto == null){
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefuegt_Auto_unbekannt);
		}
		Fahrlehrerindaten fl = auto.get_fahrlehrerin();
		if(fl != null){
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefuegt_Auto_vergeben);
		}
		Fahrlehrerindaten f_new = new Fahrlehrerindaten();
		f_new = f_new.create(name,auto);
		fahrlehrerindaten.add(f_new);
		auto.set_fahrlehrerin(f_new);
		
		//zum testen
		System.out.println("Fahrlehrerin "+ name + " und Auto mit Kennzeichen: "+kennzeichen+" hinzugefuegt");
		
		return new Systemereignis(Nachricht.Fahrlehrerin_erfolgreich_hinzugefuegt);

	}
	
	public Systemereignis auto_hinzufuegen(String kennzeichen){
		if( get_auto(kennzeichen) != null){
			return new Systemereignis(Nachricht.Auto_mit_kennzeichen_bereits_vorhanden);
		}
		else{
			autos.add(new Auto(kennzeichen));
			return new Systemereignis(Nachricht.Fahrschulauto_erfolgreich_hinzugefuegt);	
		}
	}
}
