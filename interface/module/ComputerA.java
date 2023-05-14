package module;

import printer.InterfacePrinter;

public class ComputerA implements InterfaceComputer{
    InterfacePrinter interfacePrinter;
    String name="Computer A";
    @Override
    public void setInterfacePrinter(InterfacePrinter interfacePrinter){
        this.interfacePrinter=interfacePrinter;
    }
    @Override
    public InterfacePrinter getInterfacePrinter() {
        // TODO Auto-generated method stub
        return interfacePrinter;
    }

    @Override
    public void press() {
        interfacePrinter.print(name);
    }

}
