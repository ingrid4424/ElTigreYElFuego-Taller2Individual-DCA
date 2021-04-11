package vista;

import controlador.Control;
import processing.core.PApplet;
import processing.core.PImage;

public class PantallaFinal extends Pantalla{
	
	private Control control;


	PantallaFinal(PApplet app, int posX, int posY, PImage bgImg) {
		super(app, posX, posY, bgImg);
		// TODO Auto-generated constructor stub
		
		control = new Control(getApp());
		
	}
	
	public void pintarBtn() {
		this.app.image(this.app.loadImage("./../Recursos/botonGuardartxt.png"), this.app.width/2, 600);
	}
	
	public void createTXT() {
		if(this.app.mouseX>this.app.width/2-100 && this.app.mouseX<this.app.width/2+100 &&
				this.app.mouseY>550 && this.app.mouseY<650	) {
			control.getLogic().saveTXT();
		}
		
	}

}
