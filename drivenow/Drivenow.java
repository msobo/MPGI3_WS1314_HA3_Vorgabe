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
		
		return b;
	}

	@Override
	public void initialisieren() {
		SekretaerBoundary b = new SekretaerBoundary();
		
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		
	}

}
