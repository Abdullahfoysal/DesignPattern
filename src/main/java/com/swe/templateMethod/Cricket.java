/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swe.templateMethod;

/**
 *
 * @author foysalmac
 */
public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Initialize"+ this.toString());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void startPlay() {
        System.out.println("StartPlay"+ this.toString());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void endPlay() {
        System.out.println("endPlay"+ this.toString());
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        return " Cricket";
    }
    
}
