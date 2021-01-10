package gui;

import gui.pages.Board;
import gui.pages.Menu;
import gui.state.StateManager;
import javax.swing.*;

public class ChessGui {
    JFrame menu = new Menu();
    JFrame board = new Board();

    public ChessGui() {
        menu.setVisible(true);

        StateManager.get().addNewGameListener(
                () -> board.setVisible(true)
        );
    }

    public StateManager getState() {
        return StateManager.get();
    }
}
