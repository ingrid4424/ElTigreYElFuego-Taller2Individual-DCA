package vista;

import processing.core.PApplet;
import processing.core.PImage;

public class PantallaInicial extends Pantalla{

	PantallaInicial(PApplet app, int posX, int posY, PImage bgImg) {
		super(app, posX, posY, bgImg);
		// TODO Auto-generated constructor stub
	}
	
	public int sgtePantalla(int posX,int posY,int tamX, int tamY, int pantalla) {
		if(this.app.mouseX>posX && this.app.mouseX<posX+tamX &&
				this.app.mouseY>posY && this.app.mouseY<posY+tamY ) {
			return pantalla+1;
		} else {
			return pantalla;
		}
		
		
	}

}
