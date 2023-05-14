import Model.AbstractComputer;
import Model.ComputerA;
import Model.ComputerB;
import View.GraphicPrint;
import View.InterfacePrint;
import View.StringPrint;

public class AbstractTest {
    public static void main(String[] args) {
        AbstractComputer abstractClass;
        InterfacePrint interfacePrint;
        abstractClass= (AbstractComputer)new ComputerA();
        interfacePrint=new StringPrint();
        abstractClass.setPrint(interfacePrint);
        abstractClass.press();

        ///////////////
        abstractClass= (AbstractComputer)new ComputerB();
        interfacePrint=new GraphicPrint();
        abstractClass.setPrint(interfacePrint);
        abstractClass.press();
    }
}
