package computer;

import document.InterfaceDocument;
import persistence.InterfacePersistence;
import printer.InterfacePrinter;


public interface InterfaceComputer {
    public void setInterfaceDocument(InterfaceDocument interfaceDocument);
    public void setInterfacePrinter(InterfacePrinter interfacePrinter);
    public InterfacePrinter getInterfacePrinter();
    public void setInterfacePersistence(InterfacePersistence interfacePersistence);
    public void press();
    public void save();
}
