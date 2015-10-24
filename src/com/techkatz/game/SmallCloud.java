package com.techkatz.game;

import javax.swing.*;
import java.awt.*;

public class SmallCloud extends Actor {

    private Image image;

    public SmallCloud(int x, int y) {
        super(x, y);

        ImageIcon icon = new ImageIcon(this.loadImage("/images/small-cloud.png"));
        image = icon.getImage();
        this.setImage(image);
    }
}
