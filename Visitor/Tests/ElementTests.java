import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ElementTests {
    @Test
    void FullTime(){
        FullTime fte = new FullTime();
        fte.setName("Shannon");
        assertEquals("Shannon", fte.name);
    }
    @Test
    void PartTime(){
        PartTime pte = new PartTime();
        pte.setName("Linda");
        assertEquals("Linda", pte.name);
    }
}
