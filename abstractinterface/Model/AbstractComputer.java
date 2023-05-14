package Model;
import View.InterfacePrinter;

public abstract class AbstractComputer {
    private InterfacePrinter interfacePrint;
    private String name;
    
    public AbstractComputer() {
        name=getName();
    }
    protected abstract String getName();
    public void setInterfacePrint(InterfacePrinter interfacePrint){
        this.interfacePrint=interfacePrint;
    }
    
    protected InterfacePrinter getInterfacePrint() {
        return interfacePrint;
    }

    public void press() {
        interfacePrint.print(name);
    }
}
