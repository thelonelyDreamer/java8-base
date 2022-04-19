package com.felixwc;

import javax.swing.*;
import java.awt.*;

/**
 * in order to learn java!
 * created at 2022/4/12 22:21
 *
 * @author wangchao
 */
public class BlockMoveGame extends JFrame{
    final int RC=4;
    final int N=RC*RC;
    int[] num = new int[N];
    JButton[] btn = new JButton[N];
    JButton btnStart = new JButton("开始游戏");
    int count = 0;

    public BlockMoveGame() {
        setTitle("简单的排块游戏");
        setSize(new Dimension(600,700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setLayout(new GridLayout(RC,RC));
        p2.add(btnStart);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(p1,BorderLayout.CENTER);
        getContentPane().add(p2,BorderLayout.SOUTH);

        Font font = new Font("Times New Rome", Font.PLAIN, 24);
        for(int i =0;i<N;i++){
            num[i] =i;
            btn[i] = new JButton(""+(num[i]+1));
            btn[i].setFont(font);
            p1.add(btn[i]);
            btn[i].setVisible(true);
        }
        btn[N-1].setVisible(false);
        btnStart.addActionListener(e -> btn_StartClick());
        for(int i =0;i<N;i++){
            btn[i].addActionListener(e -> {
                for(int j=0;j<N;j++){
                    if(e.getSource() ==btn[j]){
                        btn_click(j);
                    }
                }
            });
        }
    }

    private void btn_click(int index) {
        int black,t;
        black =findBlack();
        if(isNeighbor(black,index)){
            btn[index].setVisible(false);
            btn[black].setVisible(true);
            t= num[black];
            num[black]=num[index];
            num[index]=t;
            btn[black].setText(String.valueOf(num[black]+1));
            btn[index].setText(String.valueOf(num[index]+1));
            count++;
        }
        checkResult();
    }

    private void checkResult() {
        int i;
        for(i=0;i<N;i++) if (num[i] != i) return;
        JOptionPane.showMessageDialog(this,"你赢了，一共花了"+count+"步。");
    }

    private boolean isNeighbor(int a, int b) {
        boolean r;
        r= a == b - RC || a == b + RC;
        if((a==b-1||a==b+1) &&a/RC==b/RC) r = true;
        return r;
    }

    private void btn_StartClick() {
        int i,j,k,t;
        for(i=1;i<500;i++){
            j=(int)(Math.random()*N);
            k=(int)(Math.random()*N);
            t=num[j];
            num[j]=num[k];
            num[k]=t;
        }
        for(i=0;i<N;i++){
            btn[i].setText(String.valueOf(num[i]+1));
            btn[i].setVisible(true);
        }
        i=findBlack();
        btn[i].setVisible(false);
    }
    int findBlack(){
        int i;
        for(i=0;i<N;i++){
            if(num[i]==N-1) break;
        }
        return i;
    }
    public static void main(String[] args) {
        new BlockMoveGame().setVisible(true);
    }
}
