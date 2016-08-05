/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kris
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter (int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }
    
    @Override
    public String toString() {
        if (this.value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int setter) {
        if (0 < setter && setter <= this.upperLimit) {
            this.value = setter;
        }
    }

    
}
