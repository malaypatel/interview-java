import org.junit.Test;
import static org.junit.Assert.*;

public class ClockTest {
    @Test 
    public void testGetClockAngle() {
        Clock clock = new Clock();
        assertNotNull(clock);
    }
}
