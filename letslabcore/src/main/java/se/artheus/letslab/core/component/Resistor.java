package se.artheus.letslab.core.component;

import se.artheus.letslab.core.Charge;
import se.artheus.letslab.core.Component;
import se.artheus.letslab.core.ComponentController;
import se.artheus.letslab.core.Terminal;

import java.util.ArrayList;
import java.util.List;

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
        return () -> {
            if(getTerminal1().getCharge().hasCharge()) {
                getTerminal2().setCharge(
                        new Charge(
                            getTerminal1().getCharge().getVoltage(),
                            getTerminal1().getCharge().getResistance() + getResistance()
                        )
                );
            } else {
                getTerminal1().setCharge(
                        new Charge(
                                getTerminal2().getCharge().getVoltage(),
                                getTerminal2().getCharge().getResistance() + getResistance()
                        )
                );
            }
        };
    }
}
