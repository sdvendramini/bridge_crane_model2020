package bridge_crane_project.UnitTest;

import bridge_crane_project.Model.HeartModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 */
public class HeartModelTest {

	@Test
	public void singletonTest() {
		HeartModel h1 = HeartModel.getInstance();
		HeartModel h2 = HeartModel.getInstance();
		assertEquals(h1, h2);
	}
	
	@Test
	public void instancesTest() {
		HeartModel h1 = HeartModel.getInstance();
		int inicial = h1.getCuenta();
		HeartModel.getInstance();	
		int fin = h1.getCuenta();
		assertEquals(inicial + 1, fin);
	}

}
