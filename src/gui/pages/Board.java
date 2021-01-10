package gui.pages;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    public Board() {
        super("Chess Game - Board");

        DisplayGraphics canvas = new DisplayGraphics();

        add(canvas);
        setSize(800, 835);
        setLocationRelativeTo(null);
    }
}

class DisplayGraphics extends Canvas {
    private final int pieceWidth = 100;
    private final int pieceHeight = 100;

    private final int rows = 8;
    private final int cols = 8;


    private void drawTable(Graphics g) {
        Color dark_color = new Color(
                222, 172, 93
        );
        Color light_color = new Color(
                249, 227, 192
        );

        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        g.setColor(light_color);
                    } else {
                        g.setColor(dark_color);
                    }

                } else {
                    if (j % 2 != 0) {
                        g.setColor(light_color);
                    } else {
                        g.setColor(dark_color);
                    }

                }
                g.fillRect(
                        pieceWidth * j,
                        pieceHeight * i,
                        pieceWidth,
                        pieceHeight
                );
            }
    }

    @Override
    public void paint(Graphics g) {
        drawTable(g);
    }
}