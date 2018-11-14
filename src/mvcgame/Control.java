/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/**
 *
 * @author owner
 */
class Controller {

    private Model model;
    private View view;
    private Timer tim;
    int limit = 0;
    int delay = 600;
    int counter = 60;

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
        KeyAdapter k = new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int kk = evt.getKeyCode();
                if (kk == evt.VK_LEFT) {
                    model.getR().LeftMovement();
                    view.getRb().setBounds(model.getR().getPosition());
                }
                if (kk == evt.VK_RIGHT) {
                    model.getR().RightMovement();
                    view.getRb().setBounds(model.getR().getPosition());
                }
                if (kk == evt.VK_UP) {
                    model.getR().UpMovement();
                    view.getRb().setBounds(model.getR().getPosition());
                }
                if (kk == evt.VK_DOWN) {
                    model.getR().DownMovement();
                    view.getRb().setBounds(model.getR().getPosition());
                }
            }
        };

        view.getStartButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tim.start();
                view.getRb().addKeyListener(k);
            }

        });

        tim = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model.Tackles();
                view.getTackles().setText("Tackles: " + Integer.toString(model.getTackles()));
                
                model.Score();
                view.getScore().setText("Score: " + Integer.toString(model.getScore()));

                counter = counter - 1;
                view.getTimer1().setText("Timer: " + Integer.toString(counter));

                if (model.getR().getX() <= model.getL1().getT()) {

                    model.getL1().LeftMovement();
                    view.getLb1().setBounds(model.getL1().getPosition());

                } else {
                    model.getL1().RightMovement();
                    view.getLb1().setBounds(model.getL1().getPosition());
                }

                if (model.getR().getX() <= model.getL2().getT()) {

                    model.getL2().LeftMovement();
                    view.getLb2().setBounds(model.getL2().getPosition());

                } else {

                    model.getL2().RightMovement();
                    view.getLb2().setBounds(model.getL2().getPosition());

                }

                if (model.getR().getX() >= model.getL1().getU()) {

                    model.getL1().UpMovement();
                    view.getLb1().setBounds(model.getL1().getPosition());
                } else {
                    model.getL1().DownMovement();
                    view.getLb1().setBounds(model.getL1().getPosition());

                }

                if (model.getR().getX() >= model.getL1().getU()) {

                    model.getL2().UpMovement();
                    view.getLb2().setBounds(model.getL2().getPosition());
                } else {

                    model.getL2().DownMovement();
                    view.getLb2().setBounds(model.getL2().getPosition());

                }

                if (counter == 0) {

                    tim.stop();
                    counter = 60;
                    view.getRb().removeKeyListener(k);

                }
            }
        });

//        view.getRb().addKeyListener(new KeyAdapter() {
//            public void keyPressed(KeyEvent evt) {
//                int kk = evt.getKeyCode();
//                if (kk == evt.VK_LEFT) {
//                    model.getR().LeftMovement();
//                    view.getRb().setBounds(model.getR().getPosition());
//                }
//                if (kk == evt.VK_RIGHT) {
//                    model.getR().RightMovement();
//                    view.getRb().setBounds(model.getR().getPosition());
//                }
//                if (kk == evt.VK_UP) {
//                    model.getR().UpMovement();
//                    view.getRb().setBounds(model.getR().getPosition());
//                }
//                if (kk == evt.VK_DOWN) {
//                    model.getR().DownMovement();
//                    view.getRb().setBounds(model.getR().getPosition());
//                }
//            }
//        });
        view.getLb1().setBounds(model.getL1().getPosition());
        view.getLb2().setBounds(model.getL2().getPosition());
        view.getRb().setBounds(model.getR().getPosition());
        view.getEndZone().setBounds(model.getE1());
    }

}
