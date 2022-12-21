package testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class pruebaMain {

	@Test
	public void testCliente() {
		Cliente c1 = new Cliente(9, true, false);
		Cliente c2 = new Cliente(18, true, false);
		Cliente c3 = new Cliente(25, true, false);
		Cliente c4 = new Cliente(120, true, false);
		Cliente c5 = new Cliente(125, true, false);

		
		fail("No implementado aun");
	}
	public void testGetEdad() {
		Cliente c = new Cliente();
		assertEqsauls(21, c.getEdad());
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
	
}
