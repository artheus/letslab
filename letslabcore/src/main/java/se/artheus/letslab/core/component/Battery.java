package se.artheus.letslab.core.component;

import se.artheus.letslab.core.ComponentController;
import se.artheus.letslab.core.PolarComponent;

public class Battery extends PolarComponent {
    private Double voltage;
    private Double dischargeRate;

    public Battery(Double voltage, Double dischargeRate) {
        super();

        this.voltage = voltage;
        this.dischargeRate = dischargeRate;
    }

    public Double getVoltage() {
        return voltage;
    }

    public Double getDischargeRate() {
        return dischargeRate;
    }

    @Override
    public ComponentController getController() {
        return null;
    }
}
