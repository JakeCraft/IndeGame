package com.techkatz.game;

import javax.swing.*;
import java.awt.*;

public class Chat extends Actor {

    private Image image;

    public Chat(int x, int y) {
        super(x, y);
        ImageIcon icon = new ImageIcon(this.loadImage("/images/chat.png"));
        image = icon.getImage();
        this.setImage(image);
    }
}

