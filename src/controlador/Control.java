package controlador;

import modelo.Logica;
import processing.core.PApplet;

public class Control {
	
	private Logica logic;
	private PApplet app;
	
	public Control(PApplet app) {
		this.app = app;
		logic = new Logica(app);
		}

	public Logica getLogic() {
		return logic;
	}

	public void setLogic(Logica logic) {
		this.logic = logic;
	}
}
