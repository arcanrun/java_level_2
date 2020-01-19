package ru.gb.jtwo.lone.online.circles;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.Timer;

public class GameCanvas extends JPanel {

    MainCircles gameController;
    Background bgChanger;
    long lastFrameTime;
    Timer timer = new Timer();

    GameCanvas(MainCircles gameController) {
        this.gameController = gameController;
        lastFrameTime = System.nanoTime();
//        bgChanger  = new Background(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //60fps
        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        gameController.onDrawFrame(this, g, deltaTime);
        lastFrameTime = currentTime;
//        bgChanger.startBgRandomColor();
        try {
            Thread.sleep(16);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }


    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
}
