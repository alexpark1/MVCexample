/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author owner
 */
class View {
    private JFrame initialFrame;

    private JPanel scorePanel;
    private JButton startButton;
    private JLabel timer1;
    private JLabel tackles;
    private JLabel score;
    
    private JPanel gamePanel;
    private JButton lb1;
    private JButton lb2;
    private JButton rb;
    
    private JPanel endZone;
    
    public View(){
        
        // Create and set up initial frame
        initialFrame = new JFrame("RB Game");
        initialFrame.setSize (800, 480);
        initialFrame.setLayout(null);
        initialFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create and set up score panel
        scorePanel = new JPanel();
        scorePanel.setBackground(Color.yellow);
        scorePanel.setSize(800, 50);
        initialFrame.add(scorePanel);
        
        // Create and set up buttons and labels
        startButton = new JButton("Start");
        timer1 = new JLabel("Timer: 60");
        score = new JLabel("Score: 0");
        tackles = new JLabel("Tackles: 0");
        
        // Add labels and buttons to score panel
        scorePanel.add(startButton);
        scorePanel.add(timer1);
        scorePanel.add(tackles);
        scorePanel.add(score);
        
        // Create and set up game panel
        gamePanel = new JPanel();
        gamePanel.setLayout(null);
        gamePanel.setBounds(0, 50, 800, 430);
        gamePanel.setBackground(Color.green);
        initialFrame.add(gamePanel);
        
        // Create buttons for game panel
        lb1 = new JButton("lb1");
        lb2 = new JButton("lb2");
        rb = new JButton("rb");
        
        // Create end zone panel
        endZone = new JPanel();
        endZone.setBackground(Color.white);
        initialFrame.add(endZone);
        
        // Add buttons to score panel
        gamePanel.add(lb1);
        gamePanel.add(lb2);
        gamePanel.add(rb);
        
    }

    /**
     * @return the initialFrame
     */
    public JFrame getInitialFrame() {
        return initialFrame;
    }

    /**
     * @param initialFrame the initialFrame to set
     */
    public void setInitialFrame(JFrame initialFrame) {
        this.initialFrame = initialFrame;
    }

    /**
     * @return the gamePanel
     */
    public JPanel getGamePanel() {
        return gamePanel;
    }

    /**
     * @param gamePanel the gamePanel to set
     */
    public void setGamePanel(JPanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    /**
     * @return the lb1
     */
    public JButton getLb1() {
        return lb1;
    }

    /**
     * @param lb1 the lb1 to set
     */
    public void setLb1(JButton lb1) {
        this.lb1 = lb1;
    }

    /**
     * @return the lb2
     */
    public JButton getLb2() {
        return lb2;
    }

    /**
     * @param lb2 the lb2 to set
     */
    public void setLb2(JButton lb2) {
        this.lb2 = lb2;
    }

    /**
     * @return the rb
     */
    public JButton getRb() {
        return rb;
    }

    /**
     * @param rb the rb to set
     */
    public void setRb(JButton rb) {
        this.rb = rb;
    }

    /**
     * @return the scorePanel
     */
    public JPanel getScorePanel() {
        return scorePanel;
    }

    /**
     * @param scorePanel the scorePanel to set
     */
    public void setScorePanel(JPanel scorePanel) {
        this.scorePanel = scorePanel;
    }

    /**
     * @return the startButton
     */
    public JButton getStartButton() {
        return startButton;
    }

    /**
     * @param startButton the startButton to set
     */
    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }

    /**
     * @return the timer1
     */
    public JLabel getTimer1() {
        return timer1;
    }

    /**
     * @param timer1 the timer1 to set
     */
    public void setTimer1(JLabel timer1) {
        this.timer1 = timer1;
    }

    /**
     * @return the tackles
     */
    public JLabel getTackles() {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(JLabel tackles) {
        this.tackles = tackles;
    }

    /**
     * @return the score
     */
    public JLabel getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(JLabel score) {
        this.score = score;
    }

    /**
     * @return the endZone
     */
    public JPanel getEndZone() {
        return endZone;
    }

    /**
     * @param endZone the endZone to set
     */
    public void setEndZone(JPanel endZone) {
        this.endZone = endZone;
    }
}
