package se.artheus.letslab.core;

import java.util.ArrayList;
import java.util.List;

public abstract class Node implements Component {

    List<Terminal> terminals;

    public Node() {
        this.terminals = new ArrayList<>();
    }

    public Node(List<Terminal> terminals) {
        this.terminals = terminals;
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public void addTerminal(Terminal terminal) {
        this.terminals.add(terminal);
    }
}
