/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swe.strategy;

/**
 *
 * @author foysalmac
 */
public class Main {
    public static void main(String[] args){
        OperationStrategy operation = new OperationStrategy();
        operation.setOperationStrategy(new AddStrategy());
       //  operation.setOperationStrategy(new SubstractStrategy());
        operation.execute();
        
        
    }
    
}
