package se.artheus.letslab.core.component;

import se.artheus.letslab.core.Component;
import se.artheus.letslab.core.ComponentController;
import se.artheus.letslab.core.Terminal;

public class Resistor implements Component {

    private Double resistance;

    private Terminal terminal1 = new Terminal();
    private Terminal terminal2 = new Terminal();

    /**
     * @param resistance in ohm
     */
    public Resistor(Double resistance) {
        this.resistance = resistance;
    }

    public Double getResistance() {
        return resistance;
    }

    public Terminal getTerminal1() {
        return terminal1;
    }

    public Terminal getTerminal2() {
        return terminal2;
    }

    @Override
    public ComponentController getController() {
        return null;
    }
}
