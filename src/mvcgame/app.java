/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgame;

/**
 *
 * @author owner
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View v = new View();
        Model m = new Model();
        Controller c = new Controller(m, v);
        
        v.getInitialFrame().setVisible(true);
    }
    
}
