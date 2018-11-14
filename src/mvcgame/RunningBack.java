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
class RunningBack {
    private Rectangle position;
    private int x = 100, y = 100;
    public RunningBack(){
        position = new Rectangle(getX(), getY(), 50, 50);
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
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public void LeftMovement() {

        x = x - 10;
        position = new Rectangle(getX(), getY(), 50, 50);

    }

    public void RightMovement() {

        x = x + 10;
        position = new Rectangle(getX(), getY(), 50, 50);

    }

    public void UpMovement() {

        y = y - 10;
        position = new Rectangle(getX(), getY(), 50, 50);

    }

    public void DownMovement() {
       
        y = y + 10;
        position = new Rectangle(getX(), getY(), 50, 50);
        
    }
}

