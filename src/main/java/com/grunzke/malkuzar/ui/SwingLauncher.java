package com.grunzke.malkuzar.ui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingLauncher {
  private Container cp;
  private void createAndShowGUI() {
    // Create and set up the window.
    JFrame frame = new JFrame("Malkuzar");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Box cardBox = Box.createHorizontalBox();
    cardBox.add(new JLabel("One"));
    cardBox.add(new JLabel("2"));
    cardBox.add(new JLabel("* * *"));

//    ExecutorService ex = Executors.newSingleThreadExecutor();
//    this.statusPoller = new StatusPoller(statusLabel);
//    ex.submit(statusPoller);

    this.cp = frame.getContentPane();
    cp.setLayout(new BorderLayout());
    cp.add(cardBox, BorderLayout.NORTH);
    MapPanel mp = new MapPanel();
    mp.setSize(400, 400);
    cp.add(mp, BorderLayout.CENTER);

    // Display the window.
    frame.pack();
    frame.setVisible(true);
  }

  public void startup() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
  
  public static void main(String[] args) {
    new SwingLauncher().startup();
  }
}
