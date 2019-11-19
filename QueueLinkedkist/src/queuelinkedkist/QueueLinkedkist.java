/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedkist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Propietario
 */
public class QueueLinkedkist {

     public static void main(String[] args) {
      
        Queue<String> queue = new LinkedList();
        queue.add("Adrian");
        queue.add("jesus");
        queue.add("Daniel");
        
        queue.offer("Francisco");
        
        System.out.println("cila removida"+queue.remove());;
        
        System.out.println("frente de la cola"+queue.element());
        
        System.out.println("se eleminino el elemento"+queue.peek());
        
        System.out.println(queue.toString());
    }
}
