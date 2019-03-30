/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaqueue;

import java.util.ArrayList;

/**
 *
 * @author hemant
 * myQueue.java
 */
public class myQueue implements PizzaInterface {
    private ArrayList<Order> aL;
    
    public myQueue(){
        aL=new ArrayList<Order>();
    }
    
    public boolean isFull(){
        return false;
    }
    public boolean isEmpty(){
        return aL.isEmpty();
    }
    public int size(){
        return aL.size();
    }
    public void enqueue(Object element){
         aL.add((Order)element);
    }
    public Object dequeue(){
        if(!(aL.isEmpty())){
            return aL.remove(0);
        }
        else{
            return null;
        }
    }
    public Object frontElement(){
        if(!(aL.isEmpty())){
            return aL.get(0);
        }
        else{
            return null;
        }
    }
    
    
}
