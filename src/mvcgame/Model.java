/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgame;

import java.awt.Rectangle;

/**
 *
 * @author owner
 */
class Model {
    private LineBacker l1;
    private LineBacker l2;
    private RunningBack r;
    private Rectangle e1;
    private int score;
    private int tackles;
    
    public Model(){
        score = 0;
        tackles = 0;
        r = new RunningBack();
        l1 = new LineBacker(r);
        l2 = new LineBacker(r); 
        e1 = new Rectangle(600, 0, 50, 240);
        l2.setU(l2.getU() + 100);
    }
    
    public void Tackles(){
        if (r.getPosition().intersects(l1.getPosition()) || r.getPosition().intersects(l2.getPosition())){
            setTackles(getTackles() + 1);
            r.setX(100);
            r.setY(100);
            r.setPosition(new Rectangle(r.getX(), r.getY(), 50, 50));
            
            l1.setT(500);
            l1.setU(50);
            l1.setPosition(new Rectangle(l1.getT(), l1.getU(), 50, 50));
            
            l2.setT(500);
            l2.setU(150);
            l2.setPosition(new Rectangle(l1.getT(), l1.getU(), 50, 50));
        }
    }
    
    public void Score(){
        if (r.getPosition().intersects(e1)){
            setScore(getScore()+1);
            r.setX(100);
            r.setY(100);
            r.setPosition(new Rectangle(r.getX(), r.getY(), 50, 50));
            
            l1.setT(500);
            l1.setU(50);
            l1.setPosition(new Rectangle(l1.getT(), l1.getU(), 50, 50));
            
            l2.setT(500);
            l2.setU(150);
            l2.setPosition(new Rectangle(l1.getT(), l1.getU(), 50, 50));
            
        }
    }

    /**
     * @return the l1
     */
    public LineBacker getL1() {
        return l1;
    }

    /**
     * @param l1 the l1 to set
     */
    public void setL1(LineBacker l1) {
        this.l1 = l1;
    }

    /**
     * @return the l2
     */
    public LineBacker getL2() {
        return l2;
    }

    /**
     * @param l2 the l2 to set
     */
    public void setL2(LineBacker l2) {
        this.l2 = l2;
    }

    /**
     * @return the r
     */
    public RunningBack getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(RunningBack r) {
        this.r = r;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the tackles
     */
    public int getTackles() {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    /**
     * @return the e1
     */
    public Rectangle getE1() {
        return e1;
    }

    /**
     * @param e1 the e1 to set
     */
    public void setE1(Rectangle e1) {
        this.e1 = e1;
    }
    
}
