import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaper(){
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(4,5);
        assertEquals(480, printer.getPaper());
    }

    @Test
    public void canRefill(){
        printer.print(4,5);
        printer.refillPaper();
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canReduceToner(){
        printer.print(9, 2);
        assertEquals(82, printer.getToner());
    }

    @Test
    public void canRefillToner(){
        printer.print(4, 5);
        printer.refillToner();
        assertEquals(100, printer.getToner());
    }
}
