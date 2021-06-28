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
public class Main {
   private static Dialog dialog;
    
   private static void initialize(){
        dialog = new WebDialog();
    }
    public static void main(String[] args){
        
        initialize();
        dialog.render();
       
    }
    
}
