package ru.gb.jtwo.lone.online.circles;

import java.awt.*;
import java.util.TimerTask;
import java.util.Timer;

public class Background extends TimerTask{

    private GameCanvas canvas;
    private Timer timer = new Timer();

    public Background(GameCanvas canvas) {
        this.canvas = canvas;
    }
    @Override
    public void run() {

        this.canvas.setBackground(new Color( (int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
    }

    public void startBgRandomColor(int ms) {

        timer.schedule(this, ms, 1000L);

    }

}
