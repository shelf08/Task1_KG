package ru.vsu.cs.lobtsov_d_a.kg.task_1;


import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel panel;

    public MainWindow() throws HeadlessException {
        panel = new DrawPanel(this.getWidth(), this.getHeight(), 2);
        this.add(panel);
    }
}