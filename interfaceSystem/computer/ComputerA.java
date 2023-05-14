package computer;

import document.InterfaceDocument;
import persistence.InterfacePersistence;
import printer.InterfacePrinter;

public class ComputerA implements InterfaceComputer{
    String name ="Computer A";
    InterfaceDocument interfaceDocument;
    InterfacePrinter interfacePrinter;
    InterfacePersistence interfacePersistence;

    public void press(){
        if(interfaceDocument==null)return;
        interfacePrinter.setInterfaceDocument(interfaceDocument);
        interfacePrinter.print();
    }
    public void save(){
        if(interfaceDocument==null)return;
        interfacePersistence.save(interfaceDocument);
    }

    @Override
    public void setInterfaceDocument(InterfaceDocument interfaceDocument) {
        // TODO Auto-generated method stub
        this.interfaceDocument=interfaceDocument;
    }
    @Override
    public void setInterfacePrinter(InterfacePrinter interfacePrinter) {
        // TODO Auto-generated method stub
        this.interfacePrinter=interfacePrinter;
    }
    @Override
    public void setInterfacePersistence(InterfacePersistence interfacePersistence) {
        // TODO Auto-generated method stub
        this.interfacePersistence=interfacePersistence;
    }
    @Override
    public InterfacePrinter getInterfacePrinter() {
        // TODO Auto-generated method stub
        return interfacePrinter;
    }
    
}
