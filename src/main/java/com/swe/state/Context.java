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
public class Context {
    private State state;
     public Context(){
         state=null;
     }
     
     public void setState(State state){
          System.out.println("Set State: "+state.toString());
         this.state=state;
     }
     public State getState(){
         return this.state;
     }
     
     
             
    
}
