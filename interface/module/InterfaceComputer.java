package module;

import printer.InterfacePrinter;

public interface InterfaceComputer {
    public void setInterfacePrinter(InterfacePrinter interfacePrint);
    public InterfacePrinter getInterfacePrinter();
    public void press();
}
