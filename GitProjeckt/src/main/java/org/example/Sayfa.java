package org.example;

import javax.swing.*;
import java.awt.*;

public class Sayfa {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    public Sayfa(){
        label.setText("İsim Fatih Sultan mehmet");
        label.setFont(new Font(null,Font.PLAIN,20));
        frame.add(label);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Profil Sayfası");
        frame.setLayout(new GridLayout(3,1));


        frame.setVisible(true);
    }
}
