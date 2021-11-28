package com.felixw.java.gui.table;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.awt.*;

/**
 * in order to learn java!
 * created at 2021/11/26 21:57
 *
 * @author wangchao
 */
public class HelloTable {


    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        TableModel tableModel = new DefaultTableModel();
        DefaultTableColumnModel defaultTableColumnModel = new DefaultTableColumnModel();
        JTable jTable = new JTable(tableModel,defaultTableColumnModel);
        jTable.getColumnModel().addColumn(new TableColumn(1,50));
        jPanel.add(jTable);
        jFrame.add(jPanel);
        jFrame.setTitle("table");
        jFrame.setSize(400,600);
        jFrame.setLocation(new Point(200,200));
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
