package com.Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame {
    private ArrayList<Object> pieceCollection;

    public GameBoard() {
        this.setSize(900, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for(int row = 0; row < 7; row++) {
            for(int col = 0; col < 9; col++) {

                GameFrame tile = new GameFrame(row, col);
                tile.render(g);




            }
        }
    }

    }
