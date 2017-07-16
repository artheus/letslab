package se.artheus.letslab.core.component;

import se.artheus.letslab.core.ComponentController;
import se.artheus.letslab.core.PolarComponent;

public class Battery extends PolarComponent {
    private Double voltage;
    private Double internalResistance;

    public Battery(Double voltage, Double internalResistance) {
        super();

        this.voltage = voltage;
        this.internalResistance = internalResistance;

        this.getAnode().getCharge().setVoltage(voltage);
        this.getAnode().getCharge().setResistance(internalResistance);
    }

    public Double getVoltage() {
        return voltage;
    }

    public Double getInternalResistance() {
        return internalResistance;
    }

    @Override
    public ComponentController getController() {
        return null;
    }
}
