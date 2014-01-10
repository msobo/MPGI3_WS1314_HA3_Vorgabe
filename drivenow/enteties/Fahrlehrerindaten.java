package drivenow.enteties;
import java.util.ArrayList;
import java.util.UUID;

public class Fahrlehrerindaten {
	
	private UUID id;
	private String name;
	private Auto auto;
	private ArrayList<Unterricht> unterricht = new ArrayList<>();
	private ArrayList<Fahrschueler> fahrschueler = new ArrayList<>();
	
	public Fahrlehrerindaten(String name){
		this.name = name;
		this.id = UUID.randomUUID();
	}

	public Fahrlehrerindaten(String name, Auto auto){
		this.id = UUID.randomUUID();
		this.name = name;
		this.auto = auto;
	}
	
	public void addUnterricht(Unterricht un){
		unterricht.add(un);
	}
	
	public void addFahrschueler(Fahrschueler fahr){
		fahrschueler.add(fahr);
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
}
