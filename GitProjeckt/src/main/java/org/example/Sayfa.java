package org.example;

import javax.swing.*;
import java.awt.*;

public class Sayfa {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel resim = new JLabel();

    public Sayfa(){
        ImageIcon icon = new ImageIcon("adam.png");

        label.setText("İsim Fatih Sultan mehmet");
        label.setFont(new Font(null,Font.PLAIN,20));
        frame.add(label);
        resim = new JLabel(icon);

        frame.setSize(1000,1000);
        frame.add(resim);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Profil Sayfası");
        frame.setLayout(new GridLayout(3,1));


        frame.setVisible(true);
    }
}
