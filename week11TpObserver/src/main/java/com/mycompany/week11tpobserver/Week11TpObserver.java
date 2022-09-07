/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week11tpobserver;

/**
 *
 * @author JiJi
 */
public class Week11TpObserver {

    public static void main(String[] args) {
        
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
        
        MessagePublisher publisher = new MessagePublisher();
        
        publisher.attach(s1);
        publisher.attach(s2);
        
        publisher.notifyUpdate(new Message("Premier message"));
        
        publisher.detach(s1);
        publisher.detach(s3);
        
        publisher.notifyUpdate(new Message("Deuxième message"));
    }
}
