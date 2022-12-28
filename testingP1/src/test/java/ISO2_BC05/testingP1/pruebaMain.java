package ISO2_BC05.testingP1;

import static org.junit.Assert.*;

import org.junit.Test;


public class pruebaMain {

	@Test
	public void testMain() {
		Cliente c1 = new Cliente(9, true, false);
		Cliente c2 = new Cliente(18, true, false);
		Cliente c3 = new Cliente(25, true, false);
		Cliente c4 = new Cliente(120, true, false);
		Cliente c5 = new Cliente(125, true, false);

		Cliente c6 = new Cliente(9, false, false);
		Cliente c7 = new Cliente(18, false, false);
		Cliente c8 = new Cliente(25, false, false);
		Cliente c9 = new Cliente(120, false, false);
		Cliente c10 = new Cliente(125, false, false);

		Cliente c11 = new Cliente(9, true, true);
		Cliente c12 = new Cliente(18, true, true);
		Cliente c13 = new Cliente(25, true, true);
		Cliente c14 = new Cliente(120, true, true);
		Cliente c15 = new Cliente(125, true, true);

		Cliente c16 = new Cliente(9, false, true);
		Cliente c17 = new Cliente(18, false, true);
		Cliente c18 = new Cliente(25, false, true);
		Cliente c19 = new Cliente(120, false, true);
		Cliente c20 = new Cliente(125, false, true);


	}
	@Test
	public void testGetEdad() {
		Cliente c = new Cliente(21,true,true);
		assertEquals(21, c.getEdad());
	}
	@Test
	public void testSetEdad() {
		Cliente c = new Cliente(21,true,true);
		c.setEdad(22);
		assertEquals(22, c.getEdad());
	}


	@Test
	public void testIsEstudiante() {
		Cliente c = new Cliente(21,true,true);
		assertEquals(true, c.isEstudiante());
	}

	@Test
	public void testSetEstudiante() {
		Cliente c = new Cliente(21,true,true);
		c.setEstudiante(false);
		assertEquals(false, c.isEstudiante());
		
	}
	@Test
	public void testIsIndependiente() {
		Cliente c = new Cliente(21,true,true);
		assertEquals(true, c.isIndependiente());
		
	}
	@Test
	public void testSetIndependiente() {
		Cliente c = new Cliente(21,true,true);
		c.setIndependiente(false);
		assertEquals(false, c.isIndependiente());
		
	}
}
	

