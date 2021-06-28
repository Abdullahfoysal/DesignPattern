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
public class OperationStrategy {
    
    private StrategyInterface operationStrategy;
    
    public void setOperationStrategy(StrategyInterface operationStrategy){
        this.operationStrategy=operationStrategy;
    }
    
    public void execute(){
       System.out.println("Execution on Operation Strategy");
       operationStrategy.execute();
    }
    
    
}
