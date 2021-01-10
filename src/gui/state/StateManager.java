package gui.state;

import java.util.ArrayList;

public class StateManager {
    static StateManager stateManager;

    ArrayList<StateChangeListener> networkListeners = new ArrayList<>();
    ArrayList<StateChangeListener> newGameListeners = new ArrayList<>();

    static public StateManager get() {
        if (stateManager == null)
            stateManager = new StateManager();

        return stateManager;
    }

    public void addOnNetworkReadyListener(StateChangeListener listener) {
        networkListeners.add(listener);
    }

    public void networkReadyAction() {
        for (StateChangeListener ls : networkListeners) {
            ls.onStateChange();
        }
    }

    public void addNewGameListener(StateChangeListener listener) {
        newGameListeners.add(listener);
    }

    public void openNewGame() {
        for (StateChangeListener ls : newGameListeners) {
            ls.onStateChange();
        }
    }
}
