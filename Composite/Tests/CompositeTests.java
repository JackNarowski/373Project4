import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompositeTests {
    @Test
    void TestStep(){
        Step step = new Step("Step", 10);
        assertEquals("Step", step.name);
        assertEquals(10, step.getTime());
    }
    @Test
    void TestComposite(){
        Step stepOne = new Step("one", 10);
        Step stepTwo = new Step("two", 10);
        Composite composite = new Composite("Composite");
        assertEquals("Composite", composite.name);
        assertEquals(0, composite.getTime());
        composite.add(stepOne);
        composite.add(stepTwo);
        assertEquals(20, composite.getTime());
        composite.remove(stepTwo);
        assertEquals(10, composite.getTime());
    }
}
