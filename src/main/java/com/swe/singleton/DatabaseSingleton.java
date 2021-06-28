/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swe.singleton;

/**
 *
 * @author foysalmac
 */
public class DatabaseSingleton {
    private static DatabaseSingleton databaseSingleton;
    
    private DatabaseSingleton(){
        System.out.println("initialize private constructor \n And setting ");
       // which call when this class initialize
    }
    
    public static DatabaseSingleton getInstance(){
        if(databaseSingleton==null){
            databaseSingleton= new DatabaseSingleton();
        }
        return databaseSingleton;
    }
    
}
