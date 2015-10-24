package com.techkatz.game;

import javax.swing.*;

public final class Party extends JFrame {

    private final int HOFFSET = 30;
    private final int LOFFSET = 6;

    public Party() {
        InitUI();
    }

    public void InitUI() {
        Board board = new Board();
        add(board);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(board.getBoardWidth() + LOFFSET, board.getBoardHeight() + HOFFSET);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Your Party");
    }

    public static void main(String[] args) {
        Party party = new Party();
        party.setVisible(true);
    }
}
