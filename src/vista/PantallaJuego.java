package vista;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class PantallaJuego extends Pantalla {
	
	private int numberList;
	private int index;
	private ArrayList<Elemento> elmentsList;

	PantallaJuego(PApplet app, int posX, int posY, PImage bgImg, int numberList, int index) {
		super(app, posX, posY, bgImg);
		// TODO Auto-generated constructor stub
		this.numberList = numberList;
		this.index = index;
		elmentsList = new ArrayList<Elemento>();
		for(int i=0; i<numberList; i++) {
			elmentsList.add(new Elemento(getApp(),getApp().loadImage("./../Recursos/FormaNormal"+(i+1)+".png"),getApp().loadImage("./../Recursos/Forma "+(i+1)+".png"),50,(200*i)+100,200,150));
		}
		
	}
	
	
	public void pintarLista() {
		for(int i=0; i<elmentsList.size();i++) {
			elmentsList.get(i).pintar();
		}
	}
	
	public void clickLista() {
		for(int i=0; i<elmentsList.size();i++) {
			elmentsList.get(i).aceptarArrastrar();
		}
	}
	
	public void draggedLista() {
		for(int i=0; i<elmentsList.size();i++) {
			elmentsList.get(i).arrastrar();
		}
	}
	
	public void soltarLista() {
		for(int i=0; i<elmentsList.size();i++) {
			elmentsList.get(i).soltarArrastrar();
		}
	}

}
