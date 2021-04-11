package vista;

import processing.core.PApplet;
import processing.core.PImage;

public  class Elemento {
	private PApplet app;
	private PImage img;
	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private boolean isArrastrable;
	private int basePositionY;
	private int basePositionX;
	private String imgSrc;
	
	Elemento(PApplet app,PImage img, String imgSrc, PImage imgreemplazar,int posX,int posY,int tamX,int tamY){
		this.app = app;
		this.img = img;
		this.imgSrc = imgSrc;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.basePositionX =posX;
		this.basePositionY =posX;
		this.isArrastrable = false;
	}
	
	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public void pintar() {
		this.app.image(img, posX, posY, tamX, tamY);
	}
	
	public void aceptarArrastrar() {
		if(this.app.mouseX>this.posX && this.app.mouseX < (this.posX+this.tamX)
				&& this.app.mouseY>this.posY && this.app.mouseY < (this.posY+this.tamY)) {
			this.isArrastrable = true;
		}
	} 
	
	public void arrastrar() {
		if(isArrastrable == true) {
			posX = app.mouseX;
			posY = app.mouseY;
		}
	} 
	
	public void soltarArrastrar() { 
		isArrastrable = false;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public PImage getImg() {
		return img;
	}

	public void setImg(PImage img) {
		this.img = img;
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

	public int getTamX() {
		return tamX;
	}

	public void setTamX(int tamX) {
		this.tamX = tamX;
	}

	public int getTamY() {
		return tamY;
	}

	public void setTamY(int tamY) {
		this.tamY = tamY;
	}

	public boolean isArrastrable() {
		return isArrastrable;
	}

	public void setArrastrable(boolean isArrastrable) {
		this.isArrastrable = isArrastrable;
	}

	public int getBasePositionY() {
		return basePositionY;
	}

	public void setBasePositionY(int basePositionY) {
		this.basePositionY = basePositionY;
	}

	public int getBasePositionX() {
		return basePositionX;
	}

	public void setBasePositionX(int basePositionX) {
		this.basePositionX = basePositionX;
	}
}
