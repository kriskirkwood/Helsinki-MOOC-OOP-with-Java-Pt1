/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kris
 */
public class Multiplier {
    
    private int x;
    
    public Multiplier(int number) {
        this.x = number;
    }
    
    public int multiply(int otherNumber) {
        return this.x * otherNumber;
    }
}
