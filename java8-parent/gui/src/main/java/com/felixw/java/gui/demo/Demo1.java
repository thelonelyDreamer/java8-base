package com.felixw.java.gui.demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * in order to learn java!
 * created at 2021/11/30 18:19
 *
 * @author wangchao
 */
public class Demo1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JTextField hello_world = new JTextField("hello world");
        jPanel.add(hello_world);
        jFrame.setSize(200,300);
        hello_world.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(hello_world.getText());
            }
        });
    }
}
