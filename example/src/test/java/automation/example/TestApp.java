package automation.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.googlecode.yatspec.junit.SpecRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpecRunner.class)
public class TestApp {

	@Test
    public void testApp()
    {
        assertTrue(true);
    }
	
	@Test
	public void testPrint() {
		assertTrue(new App().print());
	}
}
