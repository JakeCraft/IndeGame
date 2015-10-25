package com.techkatz.game;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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

        try
        {
            Clip c = AudioSystem.getClip();
            AudioInputStream inputs = AudioSystem.getAudioInputStream(Party.class.getResource("/music/Enchanted Journey.wav"));
            c.open(inputs);
            c.start();
            c.loop(-1);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Party party = new Party();
        party.setVisible(true);
    }
}
