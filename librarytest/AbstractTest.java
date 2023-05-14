import Model.AbstractComputer;
import Model.computer.AbstractComputerUp;
import Model.computer.ComputerA;
import Model.computer.ComputerB;
import Model.computer.ComputerC;
import Model.computer.ComputerD;
import View.InterfacePrinter;
import View.printer.GraphicPrinter;
import View.printer.StringPrinter;

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
        
        abstractComputerUp=(AbstractComputerUp)new ComputerD();
        interfacePrint=new GraphicPrinter();
        abstractComputerUp.setInterfacePrint(interfacePrint);
        abstractComputerUp.press(null);
    }
}
