package printer;
import document.InterfaceDocument;
import paper.InterfacePaper;

public interface InterfacePrinter {
    public void setInterfacePaper(InterfacePaper interfacePaper);
    public void setInterfaceDocument(InterfaceDocument interfaceDocument);
    public void print();   
}
