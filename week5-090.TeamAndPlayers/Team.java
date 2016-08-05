
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kris
 */
public class Team {
    
    private String name;
    private ArrayList<Player> list;
    private int maxSize = 16;
    
    
    
    public Team (String name) {
        this.name = name;
        this.list = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (list.size() < this.maxSize) {
            this.list.add(player);
        }   
    }
    
    public void printPlayers() {
        System.out.println(list);
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.list.size();
    }
    
    public int goals() {
        int totalGoals = 0;
        for (Player player : list) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}
