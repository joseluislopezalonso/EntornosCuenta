import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuentaTest {
	Cuenta c1;
	Cuenta c2;
	
	@Before
	public void setUp() throws Exception {
	c1=new Cuenta("Juan", 200);
	c2=new Cuenta();
	
	}

	@Test
	public void testCuenta() {
	assertNull(c2.getTitular());
	}

	@Test
	public void testCuentaStringDouble() {
		assertEquals("Juan", c1.getTitular());
	}

	@Test
	public void testToString() {
		assertEquals("El titular Juan tiene 200", c1.toString());
	}

	@Test
	public void testGetTitular() {
		String x=c1.getTitular();
		assertEquals("Juan", x);
	}

	@Test
	public void testSetTitular() {
		String x=c1.getTitular();
		assertEquals("Juan", x);
	}

	@Test
	public void testGetCantidadCuenta() {
		Double x=c1.getCantidadCuenta();
		assertEquals(200.0, x, 0.2);
	}

	@Test
	public void testSantidadCuenta() {
		Double x=c1.getCantidadCuenta();
		assertEquals(200.0, x, 0.2);
	}

	@Test
	public void testIngresar() {
		Double x=c1.ingresar(c1.cantidadCuenta, 100);
		assertEquals(300, x, 0.2);
	}
	@Test
	public void testIngresar2() {
		Double x=c1.ingresar(c1.cantidadCuenta, -100);
		assertEquals(200, x, 0.2);
	}

	@Test
	public void testRetirar() {
		Double x=c1.retirar(c1.cantidadCuenta, 150);
		assertEquals(50, x, 0.2);
	}
	@Test
	public void testRetirar2() {
		Double x=c1.retirar(c1.cantidadCuenta, 250);
		assertEquals(0, x, 0.2);
	}

}
