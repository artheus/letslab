package se.artheus.letslab.core;

import org.junit.Test;
import se.artheus.letslab.core.component.Battery;
import se.artheus.letslab.core.component.Resistor;

public class CircuitTest {

    @Test
    public void testCircuit() {
        Circuit circuit = new Circuit();

        Battery battery = new Battery(9.0, 0.0);
        circuit.addComponent(battery);

        Resistor resistor1 = new Resistor(420.0);
        Resistor resistor2 = new Resistor(180.0);
        Resistor resistor3 = new Resistor(1200.0);
        circuit.addComponents(resistor1, resistor2, resistor3);

        Cable batTor1 = circuit.connectTerminals(battery.getAnode(), resistor1.getTerminal1());
        Cable r1Tor2 = circuit.connectTerminals(resistor1.getTerminal2(), resistor2.getTerminal1());
        Cable r2Tor3 = circuit.connectTerminals(resistor2.getTerminal2(), resistor3.getTerminal1());
        Cable r3Tobat = circuit.connectTerminals(resistor3.getTerminal2(), battery.getCathode());

        batTor1.getController().tick();
        resistor1.getController().tick();
        r1Tor2.getController().tick();
        resistor2.getController().tick();
        r2Tor3.getController().tick();
        resistor3.getController().tick();
        r3Tobat.getController().tick();
    }
}