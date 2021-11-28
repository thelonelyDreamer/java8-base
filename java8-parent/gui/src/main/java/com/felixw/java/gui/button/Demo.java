package com.felixw.java.gui.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * in order to learn java!
 * created at 2021/11/25 18:43
 *
 * @author wangchao
 */
public class Demo {

    public static void main(String[] args) {
        Random random = new Random();
        JFrame jFrame = new JFrame();
        jFrame.setSize(200,300);
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton();
        jButton.setText("hello");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
                System.out.println(random.nextDouble());
            }
        });
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
