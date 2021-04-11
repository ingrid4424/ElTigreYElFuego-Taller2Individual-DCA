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
		//tigre,camaelon, fuego, hamaca y animales
		String[] svtxt = text.clone();
		
		svtxt[1] = svtxt[1].replace("tigre", "TIGRE");
		svtxt[2] = svtxt[2].replace("animales", "ANIMALES");
		svtxt[3] = svtxt[3].replace("hamaca", "HAMACA");
		svtxt[4] = svtxt[4].replace("fuego", "FUEGO");
		svtxt[5] = svtxt[5].replace("camaleón", "CAMALEON");
		
		
		System.out.println(svtxt[1]);
		this.app.saveStrings("./newTXT.txt", svtxt);
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}
}
