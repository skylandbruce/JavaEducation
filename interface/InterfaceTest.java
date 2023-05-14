import module.InterfaceComputer;
import module.ComputerA;
import module.ComputerB;
import printer.GraphicPrint;
import printer.InterfacePrinter;
import printer.StringPrint;

public class InterfaceTest {
    public static void main(String[] args) {
        InterfaceComputer interfaceComputer;
        InterfacePrinter interfacePrinter;

        interfaceComputer=new ComputerA();
        interfacePrinter=new StringPrint();
        interfaceComputer.setInterfacePrinter(interfacePrinter);
        interfaceComputer.press();

        ///////////////
        interfaceComputer=new ComputerB();
        interfacePrinter=new GraphicPrint();
        interfaceComputer.setInterfacePrinter(interfacePrinter);
        interfaceComputer.press();
    }
}
