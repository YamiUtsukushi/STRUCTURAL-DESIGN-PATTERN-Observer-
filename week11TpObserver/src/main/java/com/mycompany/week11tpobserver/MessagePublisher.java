/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpobserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JiJi
 */
public class MessagePublisher implements Subject{
    
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
       
        for(Observer o : observers){
        
            o.update(m);
        }
    }
    
}
