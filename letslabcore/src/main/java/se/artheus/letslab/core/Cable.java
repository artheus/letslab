package se.artheus.letslab.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Cables works as nodes between Terminals
 */
public class Cable extends Node {
    @Override
    public ComponentController getController() {
        return () -> {
            List<Double> restistance = new ArrayList<>();
            List<Double> voltage = new ArrayList<>();
            List<Double> amperage = new ArrayList<>();

            boolean parallel = this.getTerminals().size() > 2;
            List<Terminal> outputs = new ArrayList<>();

            this.getTerminals().forEach(t -> {
                if(t.getCharge().hasCharge()) {
                    restistance.add(t.getCharge().getResistance());
                    voltage.add(t.getCharge().getVoltage());
                    amperage.add(t.getCharge().getAmperage());
                } else {
                    outputs.add(t);
                }
            });

            Double forwardResistance = restistance.stream().mapToDouble(r -> {
                if(parallel) return 1/r;

                return r;
            }).sum();

            Double forwardVoltage = voltage.stream().mapToDouble(d -> d).sum();

            Charge c = new Charge(
                forwardVoltage,
                forwardResistance
            );

            outputs.forEach(t -> t.setCharge(c));

            System.out.print(getClass().getCanonicalName() + " - ");
            System.out.println(c);
        };
    }
}
