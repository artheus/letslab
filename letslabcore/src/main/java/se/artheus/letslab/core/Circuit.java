package se.artheus.letslab.core;

import java.util.ArrayList;
import java.util.List;

public class Circuit implements Runnable {

    private List<Component> componentList;
    private List<Cable> cableList;

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    public void addComponent(Component component) {
        if(this.componentList == null) this.setComponentList(new ArrayList<Component>());

        this.componentList.add(component);
    }

    public void connectTerminals(Terminal... terminals) {
        Cable cable = new Cable();

        for (Terminal t : terminals) {
            cable.addTerminal(t);
        }

        cableList.add(cable);
    }

    @Override
    public void run() {
        // Thread pool for async start components and cables.
    }
}
