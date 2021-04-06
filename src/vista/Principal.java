package vista;

import processing.core.PApplet;

public class Principal extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Principal.class.getName());
	}

	public void settings() {
		size(1024, 768);
	}

	int seleccionarPantalla;
	PantallaInicial pantallaInicial;
	PantallaJuego pantallaJuego1;
	PantallaJuego pantallaJuego2;
	PantallaJuego pantallaJuego3;
	PantallaJuego pantallaJuego4;

	public void setup() {
		seleccionarPantalla = 0;
		pantallaInicial = new PantallaInicial(this, 0, 0, loadImage("./../Recursos/Portada .jpg"));
		pantallaJuego1 = new PantallaJuego(this, 0, 0, loadImage("./../Recursos/P1.jpg"));
	}

	public void draw() {
		
		background(255);
		switch (seleccionarPantalla) {
		case 0:
			pantallaInicial.pintarBg();
			break;
		case 1:
			pantallaJuego1.pintarBg();
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;

		default:
			break;
		}
		
		text(mouseX + "&" + mouseY,mouseX,mouseY);

		
	}

	public void mouseClicked() {
		switch (seleccionarPantalla) {
		case 0:
			seleccionarPantalla = pantallaInicial.sgtePantalla(480, 650, 90, 70, seleccionarPantalla);
			break;
		case 1:
			
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;

		default:
			break;
		}
	}

	public void mouseDragged() {

	}

	public void mouseReleased() {

	}

}
