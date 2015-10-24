package com.techkatz.game;

import javax.swing.*;
import java.awt.*;

public class Player extends Actor {

    private Image image;

    public Player(int x, int y) {
        super(x, y);

        ImageIcon icon = new ImageIcon(this.loadImage("/images/present.png"));
        image = icon.getImage();
        this.setImage(image);
    }

    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }
}
