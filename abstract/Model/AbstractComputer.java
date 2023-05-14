package Model;
import View.InterfacePrint;

public abstract class AbstractComputer {
    private InterfacePrint interfacePrint;
    private String name;
    
    public AbstractComputer() {
        name=getName();
    }
    protected abstract String getName();
    public void setPrint(InterfacePrint interfacePrint){
        this.interfacePrint=interfacePrint;
    }

    public void press() {
        interfacePrint.press(name);
    }
}
