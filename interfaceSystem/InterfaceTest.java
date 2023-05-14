import computer.ComputerA;
import computer.ComputerB;
import computer.InterfaceComputer;
import document.DocumentA;
import document.DocumentB;
import document.InterfaceDocument;
import paper.InterfacePaper;
import paper.PaperA;
import paper.PaperB;
import persistence.DBpersistence;
import persistence.Filepersistence;
import persistence.InterfacePersistence;
import printer.GraphicPrint;
import printer.InterfacePrinter;
import printer.StringPrint;

public class InterfaceTest {
    public static void main(String[] args) {
        InterfaceComputer interfaceComputer;
        InterfacePrinter interfacePrinter;
        InterfaceDocument interfaceDocument;
        InterfacePaper interfacePaper;
        InterfacePersistence interfacePersistence;

        interfaceDocument=new DocumentA();
        interfaceComputer=new ComputerA();
        interfacePrinter=new StringPrint();
        interfacePaper=new PaperA();
        interfacePersistence=new Filepersistence();

        interfacePrinter.setInterfacePaper(interfacePaper);
        interfaceComputer.setInterfaceDocument(interfaceDocument);
        interfaceComputer.setInterfacePrinter(interfacePrinter);
        interfaceComputer.setInterfacePersistence(interfacePersistence);

        interfaceComputer.press();
        interfaceComputer.save();
        

        ///////////////
        interfaceDocument=new DocumentB();
        interfaceComputer=new ComputerB();
        interfacePrinter=new GraphicPrint();
        interfacePaper=new PaperB();
        interfacePersistence=new DBpersistence();

        interfacePrinter.setInterfacePaper(interfacePaper);
        interfaceComputer.setInterfaceDocument(interfaceDocument);
        interfaceComputer.setInterfacePrinter(interfacePrinter);
        interfaceComputer.setInterfacePersistence(interfacePersistence);
    
        interfaceComputer.press();
        interfaceComputer.save();
        }
}
