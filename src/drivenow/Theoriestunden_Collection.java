package drivenow;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import drivenow.enteties.Theoriestunde;


public class Theoriestunden_Collection {

	
	private ArrayList<Theoriestunde> theoriestunden;
	
	public Theoriestunde get_theoriestunde(Date beginn){
		for(int i = 0; i<theoriestunden.size();i++){
			if(theoriestunden.get(i).getBeginn() == beginn)
				return theoriestunden.get(i);
		}
		return null;
	}
	
	public boolean contains(Theoriestunde ts){
		
			if(theoriestunden.contains(ts)){
				return true;
				}
		return false;
	}
	
	private int get_anzahl_grundlagenstunden(){
		return 0;
		
	}
	
	private void finde_stunde(int thema){
		
		
	}
	public void add(Theoriestunde ts){
		
	}
}
