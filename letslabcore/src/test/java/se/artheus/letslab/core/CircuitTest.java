package se.artheus.letslab.core;

import org.junit.Test;
import se.artheus.letslab.core.component.Battery;
import se.artheus.letslab.core.component.Led;
import se.artheus.letslab.core.component.Resistor;

public class CircuitTest {

    @Test
    private void testCircuit() {
        Circuit circuit = new Circuit();

        Battery battery = new Battery(12.0, 1.0);
        circuit.addComponent(battery);

        Led led = new Led();
        circuit.addComponent(led);

        Resistor resistor = new Resistor(140000.0);
        circuit.addComponent(resistor);

        circuit.connectTerminals(battery.getAnode(), resistor.getTerminal1());
        circuit.connectTerminals(resistor.getTerminal2(), led.getAnode());
        circuit.connectTerminals(led.getCathode(), battery.getCathode());
    }
}