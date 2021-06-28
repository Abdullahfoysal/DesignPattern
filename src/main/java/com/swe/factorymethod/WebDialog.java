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
public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        System.out.println("web button creating");
        return new WebButton();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
