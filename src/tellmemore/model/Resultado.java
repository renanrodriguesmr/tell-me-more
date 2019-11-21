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
public class Resultado {
    int n_perguntas;
    int n_jogadores;
    User[] jogadores;
    
    public Resultado(int n_perguntas, int n_jogadores, User[] jogadores){
        this.n_perguntas = n_perguntas;
        this.n_jogadores = n_jogadores;
        this.jogadores = jogadores;
    }
    
    public int getN_perguntas(){
        return n_perguntas;
    }
    
    public int getN_jogadores(){
        return n_jogadores;
    }
    
    public User[] getJogadores(){
        return jogadores;
    }
}
