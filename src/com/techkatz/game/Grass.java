package com.techkatz.game;

import javax.swing.*;
import java.awt.*;

public class Grass extends Actor {

    private Image image;

    public Grass(int x, int y) {
        super(x, y);
        ImageIcon icon = new ImageIcon(this.loadImage("/images/grass.png"));
        image = icon.getImage();
        this.setImage(image);
    }
}
