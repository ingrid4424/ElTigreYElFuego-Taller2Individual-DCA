package vista;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Pantalla {
	protected PApplet app;
	private int posX;
	private int posY;
	private PImage bgImg;

	Pantalla(PApplet app,int posX,int posY, PImage bgImg){
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.bgImg = bgImg;
	}
	
	public void pintarBg() {
		this.app.image(bgImg, posY, posX);
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public PImage getBgImg() {
		return bgImg;
	}

	public void setBgImg(PImage bgImg) {
		this.bgImg = bgImg;
	}
}
