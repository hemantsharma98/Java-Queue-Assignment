/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaqueue;

/**
 *
 * @author hemant
 * PizzaInterface.java
 */
public interface PizzaInterface {
    public boolean isFull();
    public boolean isEmpty();
    public int size();
    public void enqueue(Object element);
    public Object dequeue();
    public Object frontElement();
    
}
