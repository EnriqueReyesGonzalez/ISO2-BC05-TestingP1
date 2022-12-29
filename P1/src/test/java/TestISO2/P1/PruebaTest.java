package TestISO2.P1;


import static org.junit.Assert.*;

import org.junit.Test;


public class PruebaTest {

	@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
		Cliente c1 = new Cliente(-9, true, false);
		Cliente c2 = new Cliente(18, true, false);
		Cliente c3 = new Cliente(25, true, false);
		Cliente c4 = new Cliente(120, true, false);
		Cliente c5 = new Cliente(125, true, false);

		Cliente c6 = new Cliente(-9, false, false);
		Cliente c7 = new Cliente(18, false, false);
		Cliente c8 = new Cliente(25, false, false);
		Cliente c9 = new Cliente(120, false, false);
		Cliente c10 = new Cliente(125, false, false);

		Cliente c11 = new Cliente(-9, true, true);
		Cliente c12 = new Cliente(18, true, true);
		Cliente c13 = new Cliente(25, true, true);
		Cliente c14 = new Cliente(120, true, true);
		Cliente c15 = new Cliente(125, true, true);

		Cliente c16 = new Cliente(-9, false, true);
		Cliente c17 = new Cliente(18, false, true);
		Cliente c18 = new Cliente(25, false, true);
		Cliente c19 = new Cliente(120, false, true);
		Cliente c20 = new Cliente(125, false, true);
		
		Main.obtenercuenta(c1);
		Main.obtenercuenta(c2);
		Main.obtenercuenta(c3);
		Main.obtenercuenta(c4);
		Main.obtenercuenta(c5);
		Main.obtenercuenta(c6);
		Main.obtenercuenta(c7);
		Main.obtenercuenta(c8);
		Main.obtenercuenta(c9);
		Main.obtenercuenta(c10);
		Main.obtenercuenta(c11);
		Main.obtenercuenta(c12);
		Main.obtenercuenta(c13);
		Main.obtenercuenta(c14);
		Main.obtenercuenta(c15);
		Main.obtenercuenta(c16);
		Main.obtenercuenta(c17);
		Main.obtenercuenta(c18);
		Main.obtenercuenta(c19);
		Main.obtenercuenta(c20);
		
		
		
		
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
	