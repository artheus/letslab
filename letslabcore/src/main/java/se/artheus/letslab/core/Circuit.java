package se.artheus.letslab.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Circuit implements Runnable {

    private List<Component> componentList = new ArrayList<>();
    private List<Cable> cableList = new ArrayList<>();

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }

    public void addComponents(Component... components) {
        this.componentList.addAll(Arrays.asList(components));
    }

    public Cable connectTerminals(Terminal... terminals) {
        Cable cable = new Cable();

        for (Terminal t : terminals) {
            cable.addTerminal(t);
        }

        cableList.add(cable);
        return cable;
    }

    @Override
    public void run() {
        // Thread pool for async start components and cables.
    }
}
