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
public class Main {
    public static void main(String[] args){
        Context context =new Context();
        
        StartState startState = new StartState();
         System.out.println(context.getState()+" on Main ");
        startState.doAction(context);
         System.out.println(context.getState().toString()+" on Main ");
         
         StopState stopState =new StopState();
         stopState.doAction(context);
        
        
    }
    
}
