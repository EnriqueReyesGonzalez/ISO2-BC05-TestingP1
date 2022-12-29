package TestISO2.P1;

public class Cliente {
	
	private int edad;
	private boolean estudiante, independiente;

	public Cliente(int edad, boolean estudiante, boolean independiente) {
		super();
		this.edad = edad;
		this.estudiante = estudiante;
		this.independiente = independiente;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {

		this.edad = edad;
	}

	public boolean isEstudiante() {
		return estudiante;
	}

	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}

	public boolean isIndependiente() {
		return independiente;
	}

	public void setIndependiente(boolean independiente) {
		this.independiente = independiente;
	}
}
