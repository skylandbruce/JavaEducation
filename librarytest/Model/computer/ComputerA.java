package Model.computer;

import Model.AbstractComputer;

public class ComputerA extends AbstractComputer{
    private final String name="Module A";

    public ComputerA() {
        super();
    }

    protected String getName() {
        return name;
    }

}
