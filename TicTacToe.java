import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import static java.awt.Color.*;

public class TicTacToe {
    static int count = 0;
    static boolean winner = false;

    static String checkPlayer(JButton b){
        String str = b.getText();
        return str;
    }

    static void checkWinner(JFrame f){
       Color winColor = green;
       Color tieColor = red;

       JButton b1 = (JButton) f.getContentPane().getComponent(0);
       JButton b2 = (JButton) f.getContentPane().getComponent(1);
       JButton b3 = (JButton) f.getContentPane().getComponent(2);
       JButton b4 = (JButton) f.getContentPane().getComponent(3);
       JButton b5 = (JButton) f.getContentPane().getComponent(4);
       JButton b6 = (JButton) f.getContentPane().getComponent(5);
       JButton b7 = (JButton) f.getContentPane().getComponent(6);
       JButton b8 = (JButton) f.getContentPane().getComponent(7);
       JButton b9 = (JButton) f.getContentPane().getComponent(8);
       JLabel l1 = (JLabel) f.getContentPane().getComponent(9);

       if((b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X") || (b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O")){
           b1.setBackground(winColor);
           b4.setBackground(winColor);
           b7.setBackground(winColor);
           winner = true;
           l1.setText("PLAYER "+ checkPlayer(b1)+ " IS THE WINNER!!");
       }

       else if((b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X") || (b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O")){
           b2.setBackground(winColor);
           b5.setBackground(winColor);
           b8.setBackground(winColor);
           winner = true;
           l1.setText("PLAYER "+ checkPlayer(b2)+ " IS THE WINNER!!");
       }

       else if((b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X") || (b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O")){
           b3.setBackground(winColor);
           b6.setBackground(winColor);
           b9.setBackground(winColor);
           winner = true;
           l1.setText("PLAYER "+ checkPlayer(b3)+ " IS THE WINNER!!");
       }

       else if ((b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X") || (b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O")) {
           b1.setBackground(winColor);
           b2.setBackground(winColor);
           b3.setBackground(winColor);
           winner = true;
           l1.setText("PLAYER "+ checkPlayer(b1)+ " IS THE WINNER!!");
       }

       else if ((b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X") || (b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O")) {
           b4.setBackground(winColor);
           b5.setBackground(winColor);
           b6.setBackground(winColor);
           winner = true;
           l1.setText("PLAYER "+ checkPlayer(b4)+ " IS THE WINNER!!");
       }
       else if ((b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X") || (b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O")) {
           b7.setBackground(winColor);
           b8.setBackground(winColor);
           b9.setBackground(winColor);
           winner = true;
           l1.setText("PLAYER "+ checkPlayer(b7)+ " IS THE WINNER!!");
       }

       else if ((b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X") || (b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O")) {
           b1.setBackground(winColor);
           b5.setBackground(winColor);
           b9.setBackground(winColor);
           winner = true;
           l1.setText("PLAYER "+ checkPlayer(b1)+ " IS THE WINNER!!");
       }

       else if ((b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X") || (b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O")) {
           b3.setBackground(winColor);
           b5.setBackground(winColor);
           b7.setBackground(winColor);
           winner = true;
           l1.setText("PLAYER  "+ checkPlayer(b3)+ " IS THE WINNER!!");
       }
       else if (count == 9 && winner == false) {
           b1.setBackground(tieColor);
           b2.setBackground(tieColor);
           b3.setBackground(tieColor);
           b4.setBackground(tieColor);
           b5.setBackground(tieColor);
           b6.setBackground(tieColor);
           b7.setBackground(tieColor);
           b8.setBackground(tieColor);
           b9.setBackground(tieColor);
           l1.setText("It's a TIE Match!!");
       }
    }

    public static void main(String[] args) {
        Color c = new Color(146, 146, 243);
        Color c1 = new Color(234, 226, 177);
        JFrame frame = new JFrame();


        JButton b1 = new JButton();
        b1.setBounds(10,10,80,80);
        frame.add(b1);

        JButton b2 = new JButton();
        b2.setBounds(120,10,80,80);
        frame.add(b2);

        JButton b3 = new JButton();
        b3.setBounds(230,10,80,80);
        frame.add(b3);

        JButton b4 = new JButton();
        b4.setBounds(10,120,80,80);
        frame.add(b4);

        JButton b5 = new JButton();
        b5.setBounds(120,120,80,80);
        frame.add(b5);

        JButton b6 = new JButton();
        b6.setBounds(230,120,80,80);
        frame.add(b6);

        JButton b7 = new JButton();
        b7.setBounds(10,230,80,80);
        frame.add(b7);

        JButton b8 = new JButton();
        b8.setBounds(120,230,80,80);
        frame.add(b8);

        JButton b9 = new JButton();
        b9.setBounds(230,230,80,80);
        frame.add(b9);

        JLabel labels = new JLabel("Player X's Turn");
        labels.setBounds(10,320,300,60);
        frame.add(labels);

        frame.getContentPane().setBackground(c1);
        frame.setSize(340,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b1.setText("O");
                    b1.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b1.setText("X");
                    b1.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b2.setText("O");
                    b2.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b2.setText("X");
                    b2.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b3.setText("O");
                    b3.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b3.setText("X");
                    b3.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b4.setText("O");
                    b4.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b4.setText("X");
                    b4.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b5.setText("O");
                    b5.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b5.setText("X");
                    b5.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b6.setText("O");
                    b6.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b6.setText("X");
                    b6.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b7.setText("O");
                    b7.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b7.setText("X");
                    b7.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b8.setText("O");
                    b8.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b8.setText("X");
                    b8.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!winner && count<9){count += 1;
                if(count%2==0 && count<=9){
                    b9.setText("O");
                    b9.setEnabled(false);
                    labels.setText("Player X's Turn");
                }
                else{
                    b9.setText("X");
                    b9.setEnabled(false);
                    labels.setText("Player O's Turn");
                }
                checkWinner(frame);}
            }
        });
    }
}
