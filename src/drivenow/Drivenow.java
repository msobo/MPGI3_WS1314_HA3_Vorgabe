package drivenow;

import drivenow.interfaces.IDrivenow;
import drivenow.interfaces.IFahrlehrerinBoundary;
import drivenow.interfaces.ISekretaerBoundary;

public class Drivenow implements IDrivenow{

	@Override
	public String getGruppenNummer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFahrlehrerinBoundary getFahrlehrerinBoundary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISekretaerBoundary getSekretaerBoundary() {
		
		return null;
	}

	@Override
	public void initialisieren() {
		Ressourcenverwaltung res = new Ressourcenverwaltung();
		Unterrichtsverwaltung uv = new Unterrichtsverwaltung();
		this.
		
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		
	}

}
