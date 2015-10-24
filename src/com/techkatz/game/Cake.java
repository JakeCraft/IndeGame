package com.techkatz.game;

import javax.swing.*;
import java.awt.*;

public class Cake extends Actor {

    private Image image;

    public Cake(int x, int y) {
        super(x, y);
        ImageIcon icon = new ImageIcon(this.loadImage("/images/cake.png"));
        image = icon.getImage();
        this.setImage(image);
    }
}
