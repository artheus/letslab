package se.artheus.letslab.core;

public class Terminal {
    private Charge charge;

    public Terminal() {
        this(new Charge(0d, 0d));
    }

    public Terminal(Charge charge) {
        this.charge = charge;
    }

    public Charge getCharge() {
        return charge;
    }

    public void setCharge(Charge charge) {
        this.charge = charge;
    }
}
