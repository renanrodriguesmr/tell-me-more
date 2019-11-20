/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellmemore.model;

/**
 *
 * @author renan
 */
public class User {
    
    String name;
    String status;
    int score;
    
    public User(String name, String status){
        this.name = name;
        this.status = status;
        this.score = 0;
    }
    
    public User(String name, String status, int score){
        this.name = name;
        this.status = status;
        this.score = score;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public int getScore() {
        return this.score;
    }
    
}
