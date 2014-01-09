package drivenow;

import java.util.ArrayList;





public class Ressourcenverwaltung {
	
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


	private Systemereignis fahrlehrerin_hinzufuegen(String name, String kennzeichen) {
		Auto auto = get_auto(kennzeichen);
		if(auto == null){
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefügt_Auto_unbekannt);
		}
		Fahrlehrerindaten fl = auto.get_fahrlehrerin();
		if(fl != null){
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefügt_Auto_vergeben);
		}
		Fahrlehrerindaten f_new = new Fahrlehrerindaten();
		f_new = f_new.create(name,auto);
		fahrlehrerindaten.add(f_new);
		auto.set_fahrlehrerin(f_new);
		
		//zum testen
		System.out.println("Fahrlehrerin "+ name + " und Auto mit Kennzeichen: "+kennzeichen+" hinzugefügt");
		
		return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_erfolgreich_hinzugefuegt);

	}
}
