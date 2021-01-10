package gui.pages;

import gui.state.StateManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {
    JButton newGameButton = new JButton("New Game");
    JButton exitButton = new JButton("Exit");

    @Override
    public Insets getInsets() {
        return new Insets(50, 10, 50, 10);
    }

    public Menu() {
        super("Chess Game - Menu");

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 1));
        setLocationRelativeTo(null);

        add(new JLabel("Chess Game", SwingConstants.CENTER));
        add(new JLabel("", SwingConstants.CENTER));

        newGameButton.setEnabled(false);

        add(newGameButton);
        add(exitButton);

        StateManager.get().addOnNetworkReadyListener(
                () -> newGameButton.setEnabled(true)
        );

        newGameButton.addActionListener(
                (ActionEvent e) -> StateManager.get().openNewGame()
        );

        exitButton.addActionListener(
                (ActionEvent e) -> System.exit(0)
        );
    }
}
