import Model.AbstractComputer;
import Model.AbstractComputerUp;
import Model.ComputerA;
import Model.ComputerC;
import Model.ComputerB;
import View.GraphicPrinter;
import View.InterfacePrinter;
import View.StringPrinter;

public class AbstractTest {
    public static void main(String[] args) {
        AbstractComputer abstractComputer;
        InterfacePrinter interfacePrint;
        
        abstractComputer=(AbstractComputer)new ComputerA();
        interfacePrint=new StringPrinter();
        abstractComputer.setInterfacePrint(interfacePrint);
        abstractComputer.press();

        ///////유연한 결합////////
        abstractComputer= (AbstractComputer)new ComputerB();
        interfacePrint=new GraphicPrinter();
        abstractComputer.setInterfacePrint(interfacePrint);
        abstractComputer.press();

        ///////유지보수////////
        AbstractComputerUp abstractComputerUp;
        abstractComputerUp=(AbstractComputerUp)new ComputerC();
        interfacePrint=new StringPrinter();
        abstractComputerUp.setInterfacePrint(interfacePrint);
        abstractComputerUp.press("Test");

    }
}
