/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgame;

import java.awt.Rectangle;
import java.lang.Math;

/**
 *
 * @author owner
 */
class LineBacker {

    private Rectangle position;
    private int t, u;
    private RunningBack r;

    public LineBacker(RunningBack r) {

        t = 500;
        u = 50;
        position = new Rectangle(getT(), getU(), 50, 50);

    }

    public void LeftMovement() {

        t = (int) (t - 15);
        position = new Rectangle(getT(), getU(), 50, 50);

    }

    public void RightMovement() {

        t = (int) (t + 15);
        position = new Rectangle(getT(), getU(), 50, 50);

    }

    public void UpMovement() {

        u = u - 15;
        position = new Rectangle(getT(), getU(), 50, 50);

    }

    public void DownMovement() {
       
        u = u + 15;
        position = new Rectangle(getT(), getU(), 50, 50);
        
    }

    /**
     * @return the position
     */
    public Rectangle getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Rectangle position) {
        this.position = position;
    }

    /**
     * @return the t
     */
    public int getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(int t) {
        this.t = t;
    }

    /**
     * @return the u
     */
    public int getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(int u) {
        this.u = u;
    }
}
