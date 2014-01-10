package drivenow;

import drivenow.interfaces.IDrivenow;
import drivenow.interfaces.IFahrlehrerinBoundary;
import drivenow.interfaces.ISekretaerBoundary;

public class Drivenow implements IDrivenow{
	
	SekretaerBoundary sekBoundary = null;
	FahrlehrerinBoundary fahrBoundary = null;

	@Override
	public String getGruppenNummer() {
		// return group number
		return "T04-05";
	}

	@Override
	public IFahrlehrerinBoundary getFahrlehrerinBoundary() {
		return fahrBoundary;
	}

	@Override
	public ISekretaerBoundary getSekretaerBoundary() {
		return sekBoundary;
	}

	@Override
	public void initialisieren() {
		fahrBoundary = new FahrlehrerinBoundary();
		sekBoundary = new SekretaerBoundary();
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		
	}

}
