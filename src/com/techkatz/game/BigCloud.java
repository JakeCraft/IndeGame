package com.techkatz.game;

import javax.swing.*;
import java.awt.*;

public class BigCloud extends Actor {

    private Image image;

    public BigCloud(int x, int y) {
        super(x, y);

        ImageIcon icon = new ImageIcon(this.loadImage("/images/big-cloud.png"));
        image = icon.getImage();
        this.setImage(image);
    }
}
