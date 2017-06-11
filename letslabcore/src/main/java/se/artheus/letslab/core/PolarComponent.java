package se.artheus.letslab.core;

public abstract class PolarComponent implements Component {
    private Terminal anode;
    private Terminal cathode;

    public PolarComponent() {
        this.anode = new Terminal();
        this.cathode = new Terminal();
    }

    public Terminal getAnode() {
        return anode;
    }

    public Terminal getCathode() {
        return cathode;
    }
}
