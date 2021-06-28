/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swe.factorymethod;
/**
 *
 * @author foysalmac
 */
public abstract class Dialog {
    
    abstract  Button createButton();
    void render(){
        System.out.println("Dialog class render");
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
        
    }
}
