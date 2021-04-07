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
	PantallaJuego pantallaJuego5;
	PantallaFinal pantallaFinal;

	public void setup() {
		seleccionarPantalla = 1;
		pantallaInicial = new PantallaInicial(this, 0, 0, loadImage("./../Recursos/Portada .jpg"));
		pantallaJuego1 = new PantallaJuego(this, 0, 0, loadImage("./../Recursos/P1.jpg"),3,1);
		pantallaJuego2 = new PantallaJuego(this, 0, 0, loadImage("./../Recursos/P2.jpg"),3,2);
		pantallaJuego3 = new PantallaJuego(this, 0, 0, loadImage("./../Recursos/P4.jpg"),3,3);
		pantallaJuego4 = new PantallaJuego(this, 0, 0, loadImage("./../Recursos/P5.jpg"),2,4);
		pantallaJuego5 = new PantallaJuego(this, 0,0,  loadImage("./../Recursos/P6.jpg"),2,5);
		pantallaFinal =  new PantallaFinal(this, 0, 0, loadImage("./../Recursos/Ultima.jpg"));
				}

	public void draw() {
		
		background(255);
		switch (seleccionarPantalla) {
		case 0:
			pantallaInicial.pintarBg();
			break;
		case 1:
			pantallaJuego1.pintarBg();
			pantallaJuego1.pintarLista();
			break;
		case 2:
			pantallaJuego2.pintarBg();
			break;
		case 3:
			pantallaJuego3.pintarBg();
			break;
		case 4:
			pantallaJuego4.pintarBg();
			break;
		case 5:
			pantallaJuego5.pintarBg();
			break;
		case 6:
			pantallaFinal.pintarBg();
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
			pantallaJuego1.clickLista();
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
		switch (seleccionarPantalla) {
		case 0:
			
			break;
		case 1:
			pantallaJuego1.draggedLista();
			break;
		case 2:
			
			break;
		case 3:
		
			break;
		case 4:
		
			break;
		case 5:
			
			break;
		case 6:
	
			break;

		default:
			break;
		}
	}

	public void mouseReleased() {
		switch (seleccionarPantalla) {
		case 0:
			
			break;
		case 1:
			pantallaJuego1.soltarLista();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;

		default:
			break;
		}
	}

}
