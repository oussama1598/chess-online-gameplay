import game.Chess;
import gui.ChessGui;
import client.Client;

import javax.swing.*;

public class Game extends JFrame {
    public static void main(String[] args) {
        Client client = new Client();
        Chess game = new Chess();
        ChessGui game_gui = new ChessGui();

        game_gui.getState().networkReadyAction();

        game.move("from", "to");
    }
}
