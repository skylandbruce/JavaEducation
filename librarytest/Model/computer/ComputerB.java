package Model.computer;

import Model.AbstractComputer;

public class ComputerB extends AbstractComputer{
    private final String name="Module B";
    
    public ComputerB() {
        super();
    }

    protected String getName() {
        return name;
    }
}
