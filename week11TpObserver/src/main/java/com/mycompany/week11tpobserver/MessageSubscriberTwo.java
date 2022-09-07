/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpobserver;

/**
 *
 * @author JiJi
 */
public class MessageSubscriberTwo implements Observer{
    
    @Override
    public void update(Message m) {
    
        System.out.println("MessageSubcriberTwo :: " + m.getMessageContent());
    }
    
}
