package modelo;

import processing.core.PApplet;

public class Logica {
	private String[] text;
	private PApplet app;
	
	public Logica(PApplet app) {
		this.app = app;
		text = this.app.loadStrings("./../Recursos/cuento.txt");
		
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}
}
