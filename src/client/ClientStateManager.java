package client;

import java.util.ArrayList;

public class ClientStateManager {
    private static ClientStateManager stateManager;

    ArrayList<ClientStateChangeListener> onReadyListeners = new ArrayList<>();

    static public ClientStateManager get() {
        if (stateManager == null)
            stateManager = new ClientStateManager();

        return stateManager;
    }

    public void onReady() {
        for (ClientStateChangeListener ls : onReadyListeners) {
            ls.onStateChange("");
        }
    }
}
