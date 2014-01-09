package drivenow;

import drivenow.interfaces.IDrivenow;
import drivenow.interfaces.IFahrlehrerinBoundary;
import drivenow.interfaces.ISekretaerBoundary;

public class Drivenow implements IDrivenow{
	
	SekretaerBoundary sekBoundary = null;

	@Override
	public String getGruppenNummer() {
		// return group number
		return "T04-05";
	}

	@Override
	public IFahrlehrerinBoundary getFahrlehrerinBoundary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISekretaerBoundary getSekretaerBoundary() {
		return sekBoundary;
	}

	@Override
	public void initialisieren() {
		sekBoundary = new SekretaerBoundary();
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		
	}

}
