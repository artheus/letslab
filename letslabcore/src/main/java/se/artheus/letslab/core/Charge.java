package se.artheus.letslab.core;

public class Charge {
    private Double voltage;
    private Double amperage;
    private Double resistance;

    public Charge(Double voltage, Double resistance) {
        this.voltage = voltage;
        this.resistance = resistance;
        this.calculateAmps();
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
        this.calculateAmps();
    }

    public Double getAmperage() {
        return amperage;
    }

    private void setAmperage(Double amperage) {
        this.amperage = amperage;
    }

    public Double getResistance() {
        return resistance;
    }

    public void setResistance(Double resistance) {
        this.resistance = resistance;
        this.calculateAmps();
    }

    private void calculateAmps() {
        this.setAmperage(voltage/resistance);
    }

    public boolean hasCharge() {
        return (voltage > 0 || amperage > 0 || resistance > 0);
    }

    @Override
    public String toString() {
        return "Charge{" +
                "voltage=" + voltage +
                ", amperage=" + amperage +
                ", resistance=" + resistance +
                '}';
    }
}
