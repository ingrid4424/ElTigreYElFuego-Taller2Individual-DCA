package vista;

import java.util.ArrayList;

import controlador.Control;
import processing.core.PApplet;
import processing.core.PImage;

public class PantallaJuego extends Pantalla {
	
	private int numberList;
	private int index;
	private ArrayList<Elemento> elmentsList;
	private boolean passNext;
	private Control control;
	

	PantallaJuego(PApplet app, int posX, int posY, PImage bgImg, int numberList, int index) {
		super(app, posX, posY, bgImg);
		// TODO Auto-generated constructor stub
		this.numberList = numberList;
		this.index = index;
		this.passNext = false;
		elmentsList = new ArrayList<Elemento>();
		for(int i=0; i<numberList; i++) {
			elmentsList.add(new Elemento(getApp(),
					index<4? getApp().loadImage("./../Recursos/FormaNormal"+(i+1)+".png") : getApp().loadImage("./../Recursos/FormaNormal"+(i+4)+".png") ,
							"./../Recursos/FormaNormal"+(i+1)+".png",
					getApp().loadImage("./../Recursos/Forma "+(i+1)+".png"),50,(200*i)+100,200,150));
		}
		
		control = new Control(getApp());
	}
	
	
	public void pintarLista() {
		for(int i=0; i<elmentsList.size();i++) {
			elmentsList.get(i).pintar();
		}
		
		if(passNext) {
			pintarBtn();
		}
		getApp().fill(0);
		getApp().textSize(17);
		getApp().text(control.getLogic().getText()[index], 300,50,500,200);
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
	
	public void aceptarFigura(int posX,int posY, int tamX, int tamY) {
		

		for(int i=0; i<numberList; i++) {
			if(elmentsList.get(i).getImgSrc().contains(Integer.toString(index))) {
				System.out.println(index);

				System.out.println(elmentsList.get(i).getImgSrc());
				if(elmentsList.get(i).getPosX()>posX && elmentsList.get(i).getPosX()<posX+tamX && 
						elmentsList.get(i).getPosY()>posY && elmentsList.get(i).getPosY()<posY+tamY	) {
					pintarBtn();
					
					elmentsList.get(i).setPosX(posX);
					elmentsList.get(i).setPosX(posY);
					elmentsList.get(i).setTamX(tamX);
					elmentsList.get(i).setTamY(tamY);
					passNext = true;
				}
				
				
			}
		}
	}
	
	public boolean pintarBtn() {
		getApp().image(getApp().loadImage("./../Recursos/botonsgt.png"), 258, 657);
		return true;
	}
	
	
	public int nextScreen(int pantalla) {
		if(passNext && getApp().mouseX>258 && getApp().mouseX<258+200 && 
				getApp().mouseY>657 && getApp().mouseY<657+100) {
			return pantalla+1;
		} else {
			return pantalla;
		}
 	} 

}
