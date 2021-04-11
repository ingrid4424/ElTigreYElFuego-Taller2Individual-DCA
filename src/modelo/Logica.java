package modelo;

import processing.core.PApplet;

public class Logica {
	private String[] text;
	private PApplet app;
	
	public Logica(PApplet app) {
		this.app = app;
		text = this.app.loadStrings("./../Recursos/cuento.txt");
		
	}
	
	public void saveTXT() {
		//tigre,camaelon, fueg, hamaca y animales
		text[1].replace("tigre", "TIGRE");
		text[2].replace("animales", "ANIMALES");
		text[3].replace("hamaca", "HAMACA");
		text[4].replace("fuego", "FUEGO");
		text[5].replace("camaleón", "CAMALEON");
		
		String[] svtxt = text.clone();
		this.app.saveStrings("./newTXT.txt", svtxt);
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}
}
