/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kris
 */
public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.number++;
    }

    public void decrease() {
        if (this.check == true) {
            if (this.number >= 1) {
                this.number--;
            }
        } else {
            this.number--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.number += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0 ) {
            return;
        }
            
        if (check) {
            this.number-=decreaseAmount;
            if (this.number < 0) {
                this.number = 0;
            }
        } else {
            this.number-=decreaseAmount;
} 

    }
}
