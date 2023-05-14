package Model;

public abstract class AbstractComputerUp extends AbstractComputer implements InterfacePress{
    @Override
    public void press(String contents) {
        // TODO Auto-generated method stub
        getInterfacePrint().print((contents!=null)?contents:getName());
    }
}
