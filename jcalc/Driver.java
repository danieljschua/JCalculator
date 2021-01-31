package jcalc;

import javax.swing.JFrame;

public class Driver {
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("JCalculator by Daniel Chua");
    frame.setSize(400, 600);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new CalcPanel());
    frame.setVisible(true);
  }
}