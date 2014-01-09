package drivenow;

import java.util.ArrayList;
import java.util.Collection;

public class Theoriestunden_Collection {

	
	private ArrayList<Theoriestunde> theoriestunden;
	
	public Theoriestunde get_theoriestunde(Date beginn){
		for(int i = 0; i<theoriestunden.size();i++){
			if(theoriestunden.get(i).getBeginn() ==beginn)
				return theoriestunden.get(i);
		}
		return null;
	}
	
	private boolean contains(Theoriestunde ts){
		return false;
	}
	
	private int get_anzahl_grundlagenstunden(){
		return 0;
		
	}
	
	private void finde_stunde(int thema){
		
	}
	private void add(Theoriestunde ts){
		
	}
}
