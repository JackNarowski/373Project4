import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;

public class VisitorTests {
    @Test
    void TestFTEPay(){
        FullTime fte = new FullTime();
        fte.setName("George");
        Pay pay = new Pay();
        pay.visit(fte);
    }
    @Test
    void TestPTEPay(){
        PartTime pte = new PartTime();
        pte.setName("John");
        Pay pay = new Pay();
        pay.visit(pte);
    }
    @Test
    void TestFTETrain(){
        FullTime fte = new FullTime();
        fte.setName("Dream");
        Train train = new Train();
        train.visit(fte);
    }
    @Test
    void TestPTETrain(){
        PartTime pte = new PartTime();
        pte.setName("Anthony");
        Train train = new Train();
        train.visit(pte);
    }
}
