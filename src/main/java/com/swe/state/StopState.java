/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swe.state;

/**
 *
 * @author foysalmac
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
         System.out.println("On stop state: current State : "+context.getState());
        context.setState(this);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String toString()
    {
        return "Stop state";
    }  
}
