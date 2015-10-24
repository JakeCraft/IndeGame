package com.techkatz.game;

import javax.swing.*;
import java.awt.*;

public class Balloons extends Actor {

    private Image image;

    public Balloons(int x, int y) {
        super(x, y);

        ImageIcon icon = new ImageIcon(this.loadImage("/images/balloons.png"));
        image = icon.getImage();
        this.setImage(image);
    }
}

