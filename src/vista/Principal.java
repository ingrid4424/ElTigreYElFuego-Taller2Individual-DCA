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
		seleccionarPantalla = 6;
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
			pantallaJuego1.aceptarFigura(395,315,200,300);
			break;
		case 2:
			pantallaJuego2.pintarBg();
			pantallaJuego2.pintarLista();
			pantallaJuego2.aceptarFigura(395,315,200,300);
			break;
		case 3:
			pantallaJuego3.pintarBg();
			pantallaJuego3.pintarLista();
			pantallaJuego3.aceptarFigura(395,315,200,300);
			
			break;
		case 4:
			pantallaJuego4.pintarBg();
			pantallaJuego4.pintarLista();
			pantallaJuego4.aceptarFigura(395,315,200,300);
			break;
		case 5:
			pantallaJuego5.pintarBg();
			pantallaJuego5.pintarLista();
			pantallaJuego5.aceptarFigura(395,315,200,300);
			break;
		case 6:
			pantallaFinal.pintarBg();
			pantallaFinal.pintarBtn();
			break;

		default:
			break;
		}
		

		
	}

	public void mouseClicked() {
		switch (seleccionarPantalla) {
		case 0:
			seleccionarPantalla = pantallaInicial.sgtePantalla(480, 650, 90, 70, seleccionarPantalla);
			break;
		case 1:
			pantallaJuego1.clickLista();
			seleccionarPantalla = pantallaJuego1.nextScreen(seleccionarPantalla);
			break;
		case 2:
			pantallaJuego2.clickLista();
			seleccionarPantalla = pantallaJuego2.nextScreen(seleccionarPantalla);

			break;
		case 3:
			pantallaJuego3.clickLista();
			seleccionarPantalla = pantallaJuego3.nextScreen(seleccionarPantalla);

			break;
		case 4:
			pantallaJuego4.clickLista();
			seleccionarPantalla = pantallaJuego4.nextScreen(seleccionarPantalla);

			break;
		case 5:
			pantallaJuego5.clickLista();
			seleccionarPantalla = pantallaJuego5.nextScreen(seleccionarPantalla);

			break;
		case 6:
			pantallaFinal.createTXT();
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
			pantallaJuego2.draggedLista();
			break;
		case 3:
			pantallaJuego3.draggedLista();
			break;
		case 4:
			pantallaJuego4.draggedLista();
			break;
		case 5:
			pantallaJuego5.draggedLista();
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
			pantallaJuego2.soltarLista();
			break;
		case 3:
			pantallaJuego3.soltarLista();
			break;
		case 4:
			pantallaJuego4.soltarLista();
			break;
		case 5:
			pantallaJuego5.soltarLista();
			break;
		case 6:
			break;

		default:
			break;
		}
	}

}
