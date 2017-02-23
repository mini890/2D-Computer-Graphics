package Aula_2.HelloWorld;

public class Ponto3D extends Ponto2D {
	private int z;
	
	Ponto3D() {
		//Vai buscar o construtor que é extendido (Ponto2D)
		super();
		z = 0;
	}
	
	Ponto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	int getZ() {
		return z;
	}
	
	void setZ(int z) {
		this.z = z;
	}
	
	
}