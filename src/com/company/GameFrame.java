package com.company;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame {

  private static final int FRAME_WIDTH = 600;
  private static final int FRAME_HEIGHT = 600;

  public GameFrame(){
    GamePanel gamePanel = new GamePanel();
    ImageIcon frameIcon = new ImageIcon("src\\resources\\snake.png");
    this.setIconImage(frameIcon.getImage());
    this.setBounds(new Rectangle(FRAME_WIDTH,FRAME_HEIGHT));
    this.add(gamePanel);
    this.setTitle("Snake");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }
}
