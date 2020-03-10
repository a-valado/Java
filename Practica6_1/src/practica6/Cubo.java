package practica6;

public class Cubo {
	private float lado;
	
	public Cubo() {
		
	}

	public Cubo(float lado) {
		setLado(lado);
	}
	
	public Cubo(Cubo c1) {
		setLado(c1.lado);
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	
}
