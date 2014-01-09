package drivenow;

import java.util.ArrayList;
import java.util.Calendar;


public class Theoriestunden_Collection {

	
	private ArrayList<Theoriestunde> theoriestunden;
	
	public Theoriestunde get_theoriestunde(Calendar beginn){
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
	
	public int get_anzahl_grundlagenstunden(){
		int anzahl=0;
		for(int i = 0; i<theoriestunden.size(); i++){
			if(theoriestunden.get(i).getThema()<13){
				anzahl=anzahl+1;
			}
		}
		return anzahl;
		
	}
	
	public boolean finde_stunde(int thema){
		for(int i = 0; i<theoriestunden.size(); i++){
			if(theoriestunden.get(i).getThema()==thema){
				return true;
			}
		}
		return false;
	}
	public void add(Theoriestunde ts){
		theoriestunden.add(ts);
	}
}
