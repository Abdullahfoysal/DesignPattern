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
public class WindowDialog extends Dialog{

    @Override
    Button createButton() {
        System.out.println("creating window button");
        return new WindowButton();
    }
    
}
